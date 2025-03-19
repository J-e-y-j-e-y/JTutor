package homework.oop.abstract_homework.task_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger extends Logger {
    String fileName = "src/main/java/homework/oop/abstract_homework/task_1/log.txt"; // если не пишет в файл, проверь путь или подставь абсолютный

    BufferedWriter writer;

    public FileLogger() {
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            System.out.println("Не удалось открыть файл лога на запись");
        }
    }

    @Override
    void logMessage(String message) {
        try {
            writer.write(String.format(messageFormat, new Date(), message));
            writer.flush();
        } catch (IOException e) {
            System.out.println("Не удалось записать лог");
        }
    }
}
