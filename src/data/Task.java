package data;


import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Task {
    private static Long id;
    private Date createDate;
    private Date deadLine;
    private String title;
    private String authorName;

    public Task(Long id, Date createDate, Date deadLine, String title, String authorName) {
        this.id = new Counter().getId();
        this.createDate = createDate;
        this.deadLine = deadLine;
        this.title = title;
        this.authorName = authorName;
    }

    public Date getCreateDate() {
        return new Date();
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public static Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", deadLine=" + deadLine +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
