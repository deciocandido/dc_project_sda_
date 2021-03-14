package dc_iproject_sda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

abstract class menuClass {

    List<taskClass> taskNewList = new ArrayList<>();
    ArrayList<taskClass> taskList = new ArrayList<>();
    Boolean markTask = null;
    Scanner scan = new Scanner(System.in);
    int x = 0, y = 0;

    public void printMenu(){
   
        char quit = 'n';
        String answerToQuit;
        System.out.println("Welcome to ToDoList");
        
        while(quit != 'y'){
            //counterDoneTask();
            System.out.println("You have "+ x + " task to do and " + y + " tasks are done!");
            System.out.println("Pick an option:");
            System.out.println("(1) Show Task List (by date or project)");
            System.out.println("(2) Add New Task");
            System.out.println("(3) Edit Tast (update, mark as done, remove)");
            System.out.println("(4) Save and Quit");
            
            

                int user_option = scan.nextInt();
                //Display the selected option
                switch (user_option){
                    case 1:
                    showList();
                    break;
                
                    case 2:
                    addTask();
                    break;
                
                    case 3:
                    showMiniMenu();
                    break;
                
                    case 4:
                    saveToDoList();
                    break; 

                    default:
                    System.out.println("Please a number 1-4");
                }
                System.out.println("Would you like to quit?");
                answerToQuit = scan.next().toLowerCase();
                quit = answerToQuit.charAt(0);        
        }
        scan.close();
    }
    //TODO
    public void showMiniMenu(){
        System.out.println("Select: 1 - Update");
        System.out.println("Select: 2 - Mark Done");
        System.out.println("Select: 3 - Remove");
        int user_option = scan.nextInt();
        
        //Display the selected option
        switch (user_option){
            case 1:
            editTask();
            break;
            
            case 2:
            markTask();
            break;
            
            case 3:
            removeTask();
            break;
            
            default:
            System.out.println("Please a number 1-3");
        }
    }
    // Method to list the tasks
    public void showList(){
        for (taskClass taskOnList : taskList) {
            if(taskOnList == null){
                System.out.println("There is no task registed");
            } else {
                System.out.println("These are the task is the list: " + taskOnList.taskTitle);
            }
        }
    }

    // Method to add Task into the ArrayList
    public void addTask(){
        
        System.out.println("Enter your task title:");
        String taskTitle = scan.next();
        System.out.println("Enter your task Project:");
        String taskProject = scan.next();
        System.out.println("Enter your task due date (dd-MM-yyyy): ");
        String tempTaskDate = scan.next();
        Date taskDate = null;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            taskDate = dateFormat.parse(tempTaskDate);
        } catch (Exception e){
            System.out.println("Please enter the right date format");
        }
        Boolean taskStatus = false;
        taskClass newTask = new taskClass(taskTitle, taskProject, taskStatus, taskDate);
        taskList.add(newTask); 
        taskNewList.add(newTask);
        //scan.close();   
    }

    // Method to remove Task from the ArrayList
    public void removeTask(){
        System.out.println("Enter the name of task you want to remove: ");
        String removeTaskTitle = scan.next();
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(removeTaskTitle)){
                taskList.remove(taskClass);
                System.out.println("The task " + taskClass.taskTitle + " has been removed successful");
                return;
            }
        }
    }

    //Method to edit task in the ArrayList
    public void editTask(){
        System.out.println("Enter the name of task you want to edit: ");
        String editTaskTitle = scan.next();
        System.out.println("Enter the new name of the task: ");
        String taskNewTitle = scan.next();
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(editTaskTitle)){
                String confirmedEdit = taskClass.editTaskTitle(taskNewTitle);
                System.out.println("The task " + taskClass.taskTitle + " has been edit successful to " + confirmedEdit);
                return;
            }
        }
    }

    //Method to change the status of a task in the ArrayList
    public void markTask(){
        System.out.println("Enter the name of task you want to mark done: ");
        String markTaskTitle = scan.next();
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(markTaskTitle)){
                markTask = taskClass.markTaskDone(markTaskTitle);
                System.out.println("The task: "+ taskClass.taskTitle +" The mark: " + taskClass.taskStatus.toString() + " successful");
            }
        }
    }

    //Method to save and quit
    // TODO
    public void saveToDoList(){
        System.out.println("NOT IMPLEMENTED YET");
    }
    public void counterDoneTask(){
        for (taskClass taskClass : taskList) {
            if(taskClass.taskStatus  == true){
                x++;
            } else  {
                y++;
            }
        }
    }
}
