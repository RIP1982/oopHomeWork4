package util;

import data.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReadFromConsole {
    public static Task readFromConsole() throws ParseException, IOException {
        Long id = Task.getId();
        System.out.printf("Enter the date deadline(dd.mm.yyyy): ");
        Date createDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Date deadLine = sdf.parse(br.readLine());
        System.out.printf("Enter the title: ");
        String title = (new Scanner(System.in).nextLine());
        System.out.printf("Enter the author name: ");
        String authorName = (new Scanner(System.in).nextLine());
        System.out.printf("Enter the priority level(High, Middle or Low): ");
        String level = (new Scanner(System.in).nextLine());
        try {
            if (level.equals("High")) {
                return new HighPriorityTask(id, createDate, deadLine, title, authorName, level);
            }
            else if (level.equals("Middle")) {
                return new MiddlePriorityTask(id, createDate, deadLine, title, authorName, level);
            }
            else if (level.equals("Low")) {
                return new LowPriorityTask(id, createDate, deadLine, title, authorName, level);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
