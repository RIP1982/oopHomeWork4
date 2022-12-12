package data;

import java.util.Date;

public class MiddlePriorityTask extends Task{
    private String priorityLevel;

    public MiddlePriorityTask(Long id, Date createDate, Date deadLine, String title, String authorName,
                              String priorityLevel) {
        super(id, createDate, deadLine, title, authorName);
        this.priorityLevel = priorityLevel;
    }

    public String getPriorityLevel() {
        return "Middle";
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
