import java.util.ArrayList;
import java.util.Scanner;

abstract class menuClass {

    ArrayList<taskClass> taskList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void printMenu(){
   
        char quit = 'n';
        String ans;
        //System.out.println("This is my taskList: " + taskList);
        System.out.println("Welcome to ToDoList");
        
        while(quit != 'y'){
            System.out.println("You have X task to do and Y tasks are done!");
            System.out.println("Pick an option:");
            System.out.println("(1) Show Task List (by date or project)");
            System.out.println("(2) Add New Task");
            System.out.println("(3) Edit Tast (update, mark as done, remove)");
            System.out.println("(4) Save and Quit");
            
            int user_option = scan.nextInt();
            
            //Display the selected option
            switch (user_option){
                case 1:
                listTask();
                break;
                
                case 2:
                addTask();
                break;
                
                case 4:
                break;        
            }
            System.out.println("Would you like to quit?");
            ans = scan.next().toLowerCase();
            quit = ans.charAt(0);
        }
        scan.close();
    }
    // Method to list the tasks
    public void listTask(){
        for (taskClass taskOnList : taskList) {
            System.out.println("These are the task is the list: " + taskOnList.taskTitle);
        }
    }

    // Method to add Task into the ArrayList
    public void addTask(){
        Boolean taskStatus = false;
        System.out.println("Enter your task title:");
        String taskTitle = scan.next();
        System.out.println("Enter your task Project:");
        String taskProject = scan.next();
        System.out.println("Enter your task Status:");
        String temp_taskStatus = scan.next().toLowerCase();
        if(temp_taskStatus.equals("done")){
            taskStatus = true;
        } 
        taskClass newTask = new taskClass(taskTitle, taskTitle, taskStatus);
        taskList.add(newTask); 
        scan.close();   
    }

    // Method to remove Task from the ArrayList
    public void removeTask(){

    }

    //Method to edit task in the ArrayList
    public void editTask(){

    }

    //Method to change the status of a task in the ArrayList
    public void markTask(){

    }
}
