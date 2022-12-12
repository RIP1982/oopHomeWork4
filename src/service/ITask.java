package service;

import data.Scheduler;
import data.Task;


import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public interface ITask <T extends Task>{
    T createTask() throws ParseException;
    T removeTask(ArrayList<T> tasks);

    Scheduler showAllTasks(ArrayList<T> tasks) throws ParseException;

    void writeToCsv(ArrayList<T> tasks) throws IOException;

    T showTaskById(ArrayList<T> tasks);
}
