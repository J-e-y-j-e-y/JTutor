package lessons.oop.streams_examples.file_reader_writer.ex2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "src/main/java/lessons/oop/streams_examples/file_reader_writer/ex2/example.txt";
        String contentToWrite = "Hello, this is some text written to the file.\nThis is a new line.";

        // 1. Writing to the file using FileWriter
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            // Используем try-with-resources для автоматического закрытия FileWriter
            fileWriter.write(contentToWrite);
            System.out.println("Successfully wrote to the file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // 2. Reading from the file using FileReader
        try (FileReader fileReader = new FileReader(fileName)) {
            // Используем try-with-resources для автоматического закрытия FileReader
            int character;
            System.out.println("\nReading from the file:");
            // Цикл чтения символов из файла пока не достигнем конца (-1)
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character); // Преобразуем int в char и выводим на консоль
            }
            System.out.println(); // Для красивого форматирования
            System.out.println("Successfully read from the file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
