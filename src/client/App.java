package client;

import data.Task;
import service.ITask;
import service.TaskService;
import view.View;

import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class App {
    View ui;
    ITask scheduler = new TaskService();
    ArrayList<Task> tasks = new ArrayList<>();
    Logger logger = Logger.getAnonymousLogger();

    public App() {
        ui = new ConsoleView();
    }

    public void start() throws ParseException{
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - create task\n")
                .append("2 - remove task\n")
                .append("3 - show all tasks\n")
                .append("4 - show task by id\n")
                .append("5 - write task\n")
                .append("0 - exit\n");


        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    tasks.add(scheduler.createTask());
                    logger.info(tasks.get(tasks.size()-1).toString());
                    break;
                case "2":
                    logger.info(scheduler.removeTask(tasks).toString());
                    break;
                case "3":
                    logger.info(scheduler.showAllTasks(tasks).toString());
                    break;
                case "4":
                    logger.info(scheduler.showTaskById(tasks).toString());
                    break;
                case "5":
                    try {
                        scheduler.writeToCsv(tasks);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "0":
                    return;
            }
        }
    }
}
