package lessons.oop.streams_examples.extra;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        String s1 = "Привет мир!";
        String s2 = "Hello World!";
        try (PrintWriter printWriter = new PrintWriter("src/main/resources/lessons/oop/streams_examples/extra/notes.txt")) {
            printWriter.println(s1);
            int i = 2;
            printWriter.printf("Квадрат числа %d равен %d %n", i, i * i);
            printWriter.write(s2);
            printWriter.print("Конец");
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
