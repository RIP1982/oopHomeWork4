package service;

import data.Scheduler;
import data.Task;


import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public interface ITask {
    Task createTask() throws ParseException;
    Task removeTask(ArrayList<Task> tasks);

    Scheduler showAllTasks(ArrayList<Task> tasks) throws ParseException;

    void writeToCsv(ArrayList<Task> tasks) throws IOException;

    Task showTaskById(ArrayList<Task> tasks);
}
