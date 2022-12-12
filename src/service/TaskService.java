package service;

import data.Scheduler;
import data.Task;
import util.ReadFromConsole;
import util.WriteToCsv;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class TaskService implements ITask {
    @Override
    public Task createTask() throws ParseException {
        try {
            Task task = ReadFromConsole.readFromConsole();
            return task;
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Task removeTask(ArrayList<Task> tasks) {
        Logger logger = Logger.getAnonymousLogger();
        System.out.printf("Enter id: ");
        Integer id = (new Scanner(System.in).nextInt());
        if (id > tasks.size()){
            logger.info("Task with " + id + " does not exist!");
        } else { return tasks.remove(id-1); }
        return null;
    }

    @Override
    public Scheduler showAllTasks(ArrayList<Task> tasks) throws ParseException{
        Scheduler scheduler = new Scheduler(tasks);
        return scheduler;
    }

    @Override
    public void writeToCsv(ArrayList<Task> tasks) throws IOException{
        WriteToCsv.writeToCsv(tasks);
    }

    @Override
    public Task showTaskById(ArrayList<Task> tasks) {
        Logger logger = Logger.getAnonymousLogger();
        System.out.printf("Enter id: ");
        Integer id = (new Scanner(System.in).nextInt());
        if (id > tasks.size()){
            logger.info("Task with " + id + " does not exist!");
        } else { return tasks.get(id-1); }
        return null;
    }
}
