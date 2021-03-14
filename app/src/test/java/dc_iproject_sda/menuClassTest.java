package dc_iproject_sda;

import java.text.ParseException;
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

        //assertEquals(taskTitle, expectedResult);
        
    }
}
