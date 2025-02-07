package lessons.oop.streams_examples.file_reader_writer.ex1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderExample {
    public static void main(String[] args) {
        char[] array = new char[50];
        int size = 0;
        File file = new File("src/main/resources/lessons/oop/streams_examples/file_reader_writer/fileWrite.txt");
        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)) {

            fw.write("Learn\nJava!\n");
            fw.flush();

            size = fr.read(array);
            System.out.println("Количество прочитанных символов: "
                    + size + " ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i]);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
