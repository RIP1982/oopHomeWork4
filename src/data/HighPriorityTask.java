package data;

import java.text.ParseException;
import java.util.Date;

public class HighPriorityTask extends Task {
    private Date createDate;
    private String priorityLevel;

    public HighPriorityTask(Long id, Date createDate, Date deadLine, String title, String authorName, String priorityLevel)
    throws ParseException {
        super(id, createDate, deadLine, title, authorName);
        this.priorityLevel = priorityLevel;
    }

    public String getPriorityLevel() {
        return "High";
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + super.getId() +
                ", createDate=" + super.getCreateDate() +
                ", deadLine=" + super.getDeadLine() +
                ", title='" + super.getTitle() + '\'' +
                ", authorName='" + super.getAuthorName() + '\'' +
                ", priorityLevel='" + priorityLevel + '\'' +
                '}';
    }
}
