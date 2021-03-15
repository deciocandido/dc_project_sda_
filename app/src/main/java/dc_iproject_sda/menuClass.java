import java.util.ArrayList;
import java.util.Scanner;

abstract class menuClass {

    ArrayList<taskClass> taskList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void mainMenu(){
   
        char quit = 'n';
        String ans;
        System.out.println("Welcome to ToDoList");
        
        while(quit != 'y'){
            System.out.println("You have X task to do and Y tasks are done!");
            System.out.println("Pick an option:");
            System.out.println("(1) Show Task List (by date or project)");
            System.out.println("(2) Add New Task");
            System.out.println("(3) Edit Tast (update, mark as done, remove)");
            System.out.println("(4) Save and Quit");
            
            int userMain = scan.nextInt();
            
            //Display the selected option
            switch (userMain){
                case 1:
                //listTask();
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
                saveToDoList();
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
        taskClass newTask = new taskClass(taskTitle, taskTitle, taskStatus);
        taskList.add(newTask);  
        return taskList;
    }

    // TODO
    // Method to remove Task from the ArrayList
    public void removeTask(ArrayList<taskClass> taskList, String taskTitle){
        updateListStatus(taskList);
    }

    // TODO
    //Method to edit task in the ArrayList
    public void editTask(ArrayList<taskClass> taskList, String taskTitle){}

    // TODO
    //Method to change the status of a task in the ArrayList
    public void markTask(ArrayList<taskClass> taskList, String taskTitle){ }

    // TODO
    // Method to show the list
    public void showList(ArrayList<taskClass> taskList){}

    // TODO
    // Methods to calculate the done and undone task
    public void updateListStatus(ArrayList<taskClass> taskList){
    }

    // TODO
    // Inner Menu for Editing, Deleting and Mark Done options
    public void innerMenu(int userInnerOption){
        
        //Display the selected option
        switch (userInnerOption){
            case 1:
            //editTask(taskList);
            break;
            
            case 2:
            //markTask();
            break;
            
            case 3:
            //removeTask();
            break;
            
            default:
            System.out.println("Please a number 1-3");
        }
    }

    //Method to save and quit
    // TODO
    public void saveToDoList(){
        System.out.println("NOT IMPLEMENTED YET");
    }
}