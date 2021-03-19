package dc_project_sda_;

import java.util.ArrayList;
import java.util.Formatter;

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

    public void closeTaskFile(){
        taskFile.close();
    }
}
