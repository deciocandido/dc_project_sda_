package dc_project_sda_;

import java.util.Date;

public class taskClass implements taskInterface {

    String taskTitle;
    String taskProject;
    Boolean taskStatus;
    Date taskDate;

    public taskClass(String taskTitle, String taskProject, Boolean taskStatus, Date taskDate) {
        this.taskTitle = taskTitle;
        this.taskProject = taskProject;
        this.taskStatus = taskStatus;
        this.taskDate = taskDate;
    }

    @Override
    public void taskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
        //System.out.println("This is the task Title: " + this.taskTitle);
    }

    @Override
    public void taskProject(String taskProject) {
        this.taskProject = taskProject;
        //System.out.println("This is the task Project: " + this.taskTitle);
    }

    @Override
    public void taskStatus(Boolean taskStatus) {
        this.taskStatus = taskStatus;
        //System.out.println("This is the task Status: " + this.taskStatus);
    }

    @Override
    public void taskDueDate(Date taskDate) {
        this.taskDate = taskDate;
        //System.out.println("This is the task due date: " + this.taskDate);
    }
    public String editTaskTitle(String taskNewTitle){
        this.taskTitle = taskNewTitle;
        return this.taskTitle;
    }
    public void markTaskDone(String taskTitle){
        this.taskStatus = true;
        //return this.taskStatus;
    }

    public String getProject(){
        return taskProject;
    }
    public Date getDueDate(){
        return taskDate;
    }

}