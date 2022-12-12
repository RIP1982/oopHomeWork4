package util;

import com.opencsv.CSVWriter;
import data.Task;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteToCsv {
    public static void writeToCsv(ArrayList<Task> tasks) throws IOException{
        List<String[]> tasksToString = new ArrayList<>();
        for (Task task: tasks) {
            String[] taskToString = new String[]{String.valueOf(task)};
            tasksToString.add(taskToString);
        }
        try (CSVWriter writer = new CSVWriter(new FileWriter("src/tasks.csv"))) {
            writer.writeAll(tasksToString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
