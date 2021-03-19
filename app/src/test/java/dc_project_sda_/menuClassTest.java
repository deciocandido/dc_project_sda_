package dc_project_sda_;

import java.nio.channels.UnresolvedAddressException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.lang.model.type.ErrorType;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class menuClassTest {
 

    @Test
    public void testAddingTaskCorrectedIntoArrayListByCheckingTheTaskTitleOfTheIndex0TaskTitle(){
        menuClass menuOptions = new menuClass(){};
        String taskProject = "sda";
        Boolean taskStatus = false;
        String taskTitle = "dd";
        ArrayList<taskClass> taskList = new ArrayList<>();
        taskList = menuOptions.addTask(taskList, taskTitle, taskProject, taskStatus);
        String endResult = taskList.get(0).taskTitle;
        String expectedResult = "dd";
        assertEquals(endResult, expectedResult);   
    }

    @Test
    public void testAddingEmptyTaskTitleToTheArrayListWithCorrectedParametersType(){
        menuClass menuOptions = new menuClass(){};
        String taskProject = "sda";
        Boolean taskStatus = false;
        String taskTitle = "";
        ArrayList<taskClass> taskList = new ArrayList<>();
        taskList = menuOptions.addTask(taskList, taskTitle, taskProject, taskStatus);
        String endResult = taskList.get(0).taskTitle;
        String expectedResult = "";
        assertEquals(endResult, expectedResult);  
    }

    @Test
    public void testAddingEmptyTaskProjectToTheArrayListWithCorrectedParametersType(){
        menuClass menuOptions = new menuClass(){};
        String taskProject = "";
        Boolean taskStatus = false;
        String taskTitle = "dd";
        ArrayList<taskClass> taskList = new ArrayList<>();
        taskList = menuOptions.addTask(taskList, taskTitle, taskProject, taskStatus);
        String endResult = taskList.get(0).taskProject;
        String expectedResult = "";
        assertEquals(endResult, expectedResult);  
    }

    @Test
    public void testEdtingTaskWithCorrectedParametersAsSuccessResult(){
        taskClass newTask = new taskClass("dd", "sda", false);
        ArrayList<taskClass> taskList = new ArrayList<>();
        taskList.add(newTask);
        String userInputTaskTitle = "da";
        String endResult = "";
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(newTask.taskTitle)){
                endResult = taskClass.editTaskTitle(userInputTaskTitle);
                return;
            }
        }
        String expectedResult = "da";
        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWhenSearchIsEmptyTaskTitleString(){
        taskClass newTask = new taskClass("dd", "sda", false);
        ArrayList<taskClass> taskList = new ArrayList<>();
        taskList.add(newTask);
        String taskTitleToEdit = "";
        String newTaskTitle = "da";
        String endResult = "";
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(taskTitleToEdit)){
                endResult = taskClass.editTaskTitle(newTaskTitle);
                return;
            }
        }
        String expectedResult = "";
        assertEquals(endResult, expectedResult);  
    }
    @Test
    public void testEdtingTaskWithSearchValueTrueAndEmptyTaskClassOnTaskTitle(){
        taskClass newTask = new taskClass("", "", false);
        ArrayList<taskClass> taskList = new ArrayList<>();
        taskList.add(newTask);
        String taskTitleToEdit = "dd";
        String newTaskTitle = "da";
        String endResult = "";
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(taskTitleToEdit)){
                endResult = taskClass.editTaskTitle(newTaskTitle);
                return;
            }
        }
        String expectedResult = "";
        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void testEdtingTaskWithEmptyArrayList(){
        ArrayList<taskClass> taskList = new ArrayList<>();
        String taskTitleToEdit = "dd";
        String newTaskTitle = "da";
        String endResult = "";
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(taskTitleToEdit)){
                endResult = taskClass.editTaskTitle(newTaskTitle);
                return;
            }
        }
        String expectedResult = "";
        assertEquals(endResult, expectedResult);    
    }

    @Test
    public void ______testDeleteTaskWithCorrectedParametersAsSuccessResult(){
        taskClass newTask = new taskClass("dd", "sda", false);
        ArrayList<taskClass> taskList = new ArrayList<>();
        taskList.add(newTask);
        String taskTitleToDelete = "dd";
        int endResult;
        for (taskClass taskClass : taskList) {
            if(taskClass.taskTitle.equals(taskTitleToDelete)){
                taskList.remove(taskClass);
            }
        }
        endResult = taskList.size();
        int expectedResult = 0;
        assertEquals(endResult, expectedResult);  
    }
    @Test
    public void ______testDeleteTaskWithIncorrectedTaskTitleRefParametersAsInt(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testDeleteTaskWithEmptyArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testDeleteTaskWithNoPassingParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testDeleteTaskWithNoArrayListCreated(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithCorrectedParametersAsSuccessResult(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithIncorrectedTaskTitleRefParametersTypeAsInt(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithEmptyArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithNoPassingAnyParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithNoArrayListCreated(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithIncorrectedTaskTitleRefParametersType(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithTaskNotFoundInTheArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithIncorrectedTaskArrayListTitleParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneTaskWithIncorrectedTaskArrayListAndTaskTitleRefParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testMarkTaskAsDoneWithNoPassingArrayListParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }

    @Test
    public void testListingTheNumberOfTaskWithStatusNotDoneWithCorrectedParametersAsSuccessResult(){
        ArrayList<taskClass> taskList = new ArrayList<>();
        for(int x = 0; x < 5; x++){
            taskClass newTask = new taskClass("taskTitle", "taskProject", false);
            taskList.add(newTask);
        }
        int endResult = 0;
        int y = 0;
        for (taskClass taskClass : taskList) {
            if(taskClass.taskStatus  == false){
                endResult++;
            } else  {
                y++;
            }
        }
        int expectedResult = 5;

        assertEquals(endResult, expectedResult);   
    }
    
    @Test
    public void testListingTheNumberOfTaskWithStatusDoneWithCorrectedParametersAsSuccessResult(){
        ArrayList<taskClass> taskList = new ArrayList<>();
        for(int x = 0; x < 5; x++){
            taskClass newTask = new taskClass("taskTitle", "taskProject", true);
            taskList.add(newTask);
        }
        int endResult = 0;
        int y = 0;
        for (taskClass taskClass : taskList) {
            if(taskClass.taskStatus  == true){
                endResult++;
            } else  {
                y++;
            }
        }
        int expectedResult = 5;

        assertEquals(endResult, expectedResult);   
    }
    
    @Test
    public void ______testListingTheNumberOfTaskDoneAndNotDoneWithEmptyArrayList(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testListingTheNumberOfTaskDoneAndNotDoneWithNoPassingParameters(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testListingTheNumberOfTaskDoneAndNotDoneWithNoArrayListCreated(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
    @Test
    public void ______testListingTheNumberOfTaskDoneAndNotDoneWithDeclaringandInicializingLocalVariableToOverideTheGlobalVariable(){
        String endResult = "a";
        String expectedResult = "D";

        assertEquals(endResult, expectedResult);   
    }
}
