package lessons.oop.streams_examples.buffered_reader_writer.ex2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("src/main/resources/lessons/oop/streams_examples/buffered_reader_writer/buffWriter.txt"))) {
            String text = "Привет мир!";
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
