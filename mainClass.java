//import java.util.ArrayList;
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

        //declaring and initialized an Arraylist taskClass
        //
        //ArrayList <taskClass> taskList = new ArrayList<>();

        scan.close();
    }
}
