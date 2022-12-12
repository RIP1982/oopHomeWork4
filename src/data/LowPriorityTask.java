package data;

import javax.xml.crypto.Data;
import java.util.Date;

public class LowPriorityTask extends Task{
    private String priorityLevel;

    public LowPriorityTask(Long id, Date createDate, Date deadLine, String title, String authorName,
                           String priorityLevel) {
        super(id, createDate, deadLine, title, authorName);
        this.priorityLevel = priorityLevel;
    }

    public String getPriorityLevel() {
        return "Low";
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
