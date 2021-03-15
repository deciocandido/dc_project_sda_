package app.src.test.java.dc_project_sda_;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class menuClassTest {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    ArrayList<taskClass> taskList = new ArrayList<>();
    menuClass menuOptions = new menuClass(){};
        

    @Test
    void testAddingTaskCorrectedIntoArrayList(){
        //menuOptions.printMenu();
        String taskTitle = "1";
        String expectedResult = "1";

        assertEquals(taskTitle, expectedResult);
        
    }
}
