public class taskClass implements taskInterface{

     String taskTitle;
     String taskProject;
     Boolean taskStatus;

    public taskClass(String taskTitle, String taskProject, Boolean taskStatus) {
        this.taskTitle = taskTitle;
        this.taskProject = taskProject;
        this.taskStatus = taskStatus;
    }

    @Override
    public void task_Title(String taskTitle) {
        this.taskTitle = taskTitle;
        System.out.println("This is the task Title: " + this.taskTitle);
    }

    @Override
    public void task_Project(String taskProject){
        this.taskProject = taskProject;
        System.out.println("This is the task Project: " + this.taskTitle);
    }

    @Override
    public void task_Status(Boolean taskStatus){
        this.taskStatus = taskStatus;
        System.out.println("This is the task Status: " + this.taskStatus);
    }

   
}
