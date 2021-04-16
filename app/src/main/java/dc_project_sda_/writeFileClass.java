package dc_project_sda_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class writeFileClass {
    private Formatter taskFile;

    public void openTaskFile(){
        try{
            taskFile = new Formatter("TaskFile.txt");
        } catch (Exception e){
            System.out.println("Error while try to open the file");
        }
    }

    public void addTaskFile(ArrayList<taskClass> taskArrayList){
        for (taskClass taskClass : taskArrayList) {
            taskFile.format("%s%s%s%s", taskClass.taskTitle+" ", taskClass.taskProject+" ", taskClass.taskDate+" ", taskClass.taskStatus);
        }
    }

    public ArrayList<taskClass> readFromFile(String fileName){
        try{
            File myFile = new File(fileName);
            Scanner myScan = new Scanner(myFile);
            while (myScan.hasNextline()){

                String data = myScan.nextLine();
                System.out.println(data);
            }
            myScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error on file reading: " + e);
        }
    }

    public void closeTaskFile(){
        taskFile.close();
    }
}
