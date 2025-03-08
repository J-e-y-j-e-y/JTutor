package homework.oop.abstract_homework.task_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleLogger extends Logger {

    public ConsoleLogger() {
        messageFormat = "%s %s";
    }

    @Override
    void logMessage(String message) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String msg = String.format(messageFormat, date, message);
        System.out.println(msg);
    }
}
