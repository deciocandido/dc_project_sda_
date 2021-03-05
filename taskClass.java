import java.util.Date;

public class taskClass {
    private String taskTitle;
    private Date taskDate;
    private String taskState;
    

    public taskClass(String taskTitle, Date taskDate, String taskState) {
        this.taskDate = taskDate;
        this.taskState = taskState;
        this.taskTitle = taskTitle;
    }


}