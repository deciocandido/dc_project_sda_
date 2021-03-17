package app.src.test.java.dc_project_sda_;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class menuClassTest {
 

    @Test
    public void testAddingTaskCorrectedIntoArrayList(){
        String taskProject = "sda";
        Boolean taskStatus = false;
        String taskTitle = "dd";
        ArrayList<taskClass> taskList = new ArrayList<>();
        menuClass menuOptions = new menuClass(){};
        taskList = menuOptions.addTask(taskList, taskTitle, taskProject, taskStatus);

        taskClass expectedClass = new taskClass("dd", "sda", false);
        ArrayList<taskClass> expectedResult = new ArrayList<>();
        expectedResult.add(expectedClass);

        assertEquals(taskList, expectedResult);   
    }

    @Test
    public void testAddingTaskWithIncorrectedParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);    
    }

    @Test
    public void testAddingEmptyTaskWithCorrectedParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }

    @Test
    public void testAddingEmptyTaskWithIncorrectedParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }

    @Test
    public void testEdtingTaskWithCorrectedParametersAsSuccessResult(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWithIncorrectedEditTaskTitleParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWithIncorrectedTaskNewTitleParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWithIncorrectedTaskArrayListTitleParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWithIncorrectedTaskArrayListAndEditTaskTitlAndTaskNewTitleParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWithNoPassingParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWithEmptyArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWithNoArrayListCreated(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testDeleteTaskWithCorrectedParametersAsSuccessResult(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testDeleteTaskWithIncorrectedTaskTitleRefParametersAsInt(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testDeleteTaskWithEmptyArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testDeleteTaskWithNoPassingParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testDeleteTaskWithNoArrayListCreated(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithCorrectedParametersAsSuccessResult(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithIncorrectedTaskTitleRefParametersTypeAsInt(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithEmptyArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithNoPassingAnyParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithNoArrayListCreated(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithIncorrectedTaskTitleRefParametersType(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithTaskNotFoundInTheArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithIncorrectedTaskArrayListTitleParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneTaskWithIncorrectedTaskArrayListAndTaskTitleRefParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testMarkTaskAsDoneWithNoPassingArrayListParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }




    @Test
    public void testListingTheNumberOfTaskDoneAndNotDoneWithCorrectedParametersAsSuccessResult(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testListingTheNumberOfTaskDoneAndNotDoneWithIncorrectedArrayListParametersType(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testListingTheNumberOfTaskDoneAndNotDoneWithEmptyArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testListingTheNumberOfTaskDoneAndNotDoneWithNoPassingParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testListingTheNumberOfTaskDoneAndNotDoneWithNoArrayListCreated(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testListingTheNumberOfTaskDoneAndNotDoneWithDeclaringandInicializingLocalVariableToOverideTheGlobalVariable(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
}
