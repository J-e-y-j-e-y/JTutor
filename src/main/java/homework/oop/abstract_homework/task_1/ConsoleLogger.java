package homework.oop.abstract_homework.task_1;

import java.util.Date;

public class ConsoleLogger extends Logger {
    @Override
    void logMessage(String message) {
        System.out.println(String.format(messageFormat, new Date(), message));
    }
}
