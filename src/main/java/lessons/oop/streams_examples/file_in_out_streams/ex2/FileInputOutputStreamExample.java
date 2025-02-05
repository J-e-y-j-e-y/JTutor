package lessons.oop.streams_examples.file_in_out_streams.ex2;

import java.io.*;

public class FileInputOutputStreamExample {
    public static void main(String[] args) {
        try {
            char[] symbols = {'a', 'b', 'c'};
            OutputStream output = new FileOutputStream("src/main/java/lessons/oop/streams_examples/file_in_out_streams/ex2/a.txt");
            for (int i = 0; i < symbols.length; i++) {
                // Запись каждого символа в текстовый файл
                output.write(symbols[i]);
            }
            output.close();

            InputStream input = new FileInputStream("a.txt");
            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
            input.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
