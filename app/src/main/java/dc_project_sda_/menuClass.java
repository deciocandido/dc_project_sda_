package dc_project_sda_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

abstract class menuClass {

    private ArrayList<taskClass> taskList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int x, y;

    public void mainMenu(){
   
        char quit = 'n';
        String ans;
        System.out.println("Welcome to ToDoList");
        
        while(quit != 'y'){
            updateListStatus(taskList);
            System.out.println("You have "+x+" task to do and "+y+" tasks are done!");
            System.out.println("Pick an option:");
            System.out.println("(1) Show Task List (by date or project)");
            System.out.println("(2) Add New Task");
            System.out.println("(3) Edit Tast (update, mark as done, remove)");
            System.out.println("(4) Save and Quit");
            
            int userMain = scan.nextInt();
            
            //Display the selected option
            switch (userMain){
                case 1:
                listTask(taskList);
                break;
                
                case 2:
                Boolean taskStatus = false;
                System.out.println("Enter your task title:");
                String taskTitle = scan.next();
                System.out.println("Enter your task Project:");
                String taskProject = scan.next();
                //TODO
                // insert due date
                taskList = addTask(taskList, taskTitle, taskProject, taskStatus);
                updateListStatus(taskList);
                break;
                
                case 3:
                System.out.println("Select: 1 - Update");
                System.out.println("Select: 2 - Mark Done");
                System.out.println("Select: 3 - Remove");
                int userInnerOption = scan.nextInt();
                innerMenu(userInnerOption);
                break;
                
                case 4:
                saveToDoList(taskList);
                break; 
                
                default:
                System.out.println("Please a number 1-4");        
            }
            System.out.println("Would you like to quit?");
            ans = scan.next().toLowerCase();
            quit = ans.charAt(0);
        }
        scan.close();
    }

    // Method to add Task into the ArrayList
    public ArrayList<taskClass> addTask(ArrayList<taskClass> taskList, String taskTitle, String taskProject, Boolean taskStatus){
        taskClass newTask = new taskClass(taskTitle, taskProject, taskStatus);
        taskList.add(newTask); 
        updateListStatus(taskList); 
        return taskList;
    }

    // Inner Menu for Editing, Deleting and Mark Done options
    public void innerMenu(int userInnerOption){

        String taskTitle = scan.next();
        //Display the selected option
        switch (userInnerOption){
            case 1:
            System.out.println("Enter the name of task you want to edit: ");
            taskTitle = scan.next();
            System.out.println("Enter the new name of the task: ");
            String taskNewTitle = scan.next();
            editTask(taskList, taskTitle, taskNewTitle);
            break;
            
            case 2:
            System.out.println("Enter the name of task you want to mark done: ");
            taskTitle = scan.next();
            markTask(taskList, taskTitle);
            break;
            
            case 3:
            System.out.println("Enter the name of task you want to remove: ");
            taskTitle = scan.next();
            removeTask(taskTitle);
            break;
            
            default:
            System.out.println("Please a number 1-3");
            break;
        }
        return;
    }

    // Method to remove Task from the ArrayList
    public void removeTask(String taskTitleRef){
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(taskTitleRef)){
                taskList.remove(taskClass);
                System.out.println("The task " + taskClass.taskTitle + " has been removed successful");
                return;
            }
        }
        return;
    }

    //Method to edit task in the ArrayList
    public void editTask(ArrayList<taskClass> taskArrayList, String editTaskTitle, String taskNewTitle){
        for (taskClass taskClass : taskArrayList) {
            if(taskClass.taskTitle.equals(editTaskTitle)){
                String confirmedEdit = taskClass.editTaskTitle(taskNewTitle);
                System.out.println("The task " + taskClass.taskTitle + " has been edit successful to " + confirmedEdit);
            }
        }
        return;
    }

    //Method to change the status of a task in the ArrayList
    public void markTask(ArrayList<taskClass> taskArrayList, String taskTitleRef){
        for(taskClass taskClass : taskArrayList){
            if(taskClass.taskTitle.equals(taskTitleRef) && taskClass.taskStatus == false){
                taskClass.markTaskDone(taskTitleRef);
                System.out.println("The task: "+ taskClass.taskTitle +" The mark: " + taskClass.taskStatus.toString() + " successful");
            }
        }
        return;
    }

    // Methods to calculate the done and undone task
    public void updateListStatus(ArrayList<taskClass> taskArrayList){
        x = 0;
        y = 0;
        for (taskClass taskClass : taskArrayList) {
            if(taskClass.taskStatus  == true){
                x++;
            } else  {
                y++;
            }
        }
        return;
    }

    // Method to show the task list order by date or project
    public void listTask(ArrayList<taskClass> taskArrayList){
        Collections.sort(taskArrayList, new Comparator<taskClass>(){
            @Override
            public int compare(taskClass task1, taskClass task2){
                return task1.getProject().compareTo(task2.getProject());
            }
        });
        for (taskClass taskClass : taskArrayList) {
            System.out.println("Task title: " + taskClass.taskTitle);
        }
    }

    //Method to save and quit
    public void saveToDoList(ArrayList<taskClass> taskArrayList){
        writeFileClass saveFile = new writeFileClass();
        saveFile.openTaskFile();
        saveFile.addTaskFile(taskArrayList);
        saveFile.closeTaskFile();
        return;
    }
}