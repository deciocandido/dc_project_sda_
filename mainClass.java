//import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Choose one of the following");
        System.out.println("1. Create a task");
        System.out.println("2. Search for a tast");
        System.out.println("3. Edit a tast");
        System.out.println("4. Delete a tast");

        //Scan the user input
        int user_option = scan.nextInt();

        //Display the selected option
        System.out.println("The option selected is: " + user_option);

        switch (user_option){
            case 1:
            System.out.println("Enter your task title");
            String taskTitle = scan.next();

            System.out.println("Enter the due date");
            String dueDate = scan.next();

            System.out.println("Enter the status of the task");
            String taskStatus = scan.next();

            System.out.println("Enter the project of the task");
            String taskProject = scan.next();
            break;

            case 2:
            System.out.println("Enter your task title");
            String searchTask = scan.next();
            break;

            case 3:
            System.out.println("Enter your task title");
            String editTask = scan.next();
            break;

            case 4:
            System.out.println("Enter the task title to be deleted");
            String deleteTask = scan.next();
            break;

            default:
            System.out.println("You have enter a wrong option");


        }

        //declaring and initialized an Arraylist taskClass
        //
        //ArrayList <taskClass> taskList = new ArrayList<>();

        scan.close();
    }
}
