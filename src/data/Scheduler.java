package data;

import java.util.ArrayList;

public class Scheduler {
    ArrayList<Task> scheduler;

    public Scheduler(ArrayList<Task> scheduler) {
        this.scheduler = scheduler;
    }

    @Override
    public String toString() {
        return "Scheduler{"  +
                scheduler +
                '}';
    }
}
