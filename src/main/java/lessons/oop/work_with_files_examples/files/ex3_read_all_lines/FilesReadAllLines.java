package lessons.oop.work_with_files_examples.files.ex3_read_all_lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FilesReadAllLines {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(
                Paths.get("src/main/resources/lessons/oop/work_with_files_examples/pushkin.txt"), UTF_8);

        for (String s : lines) {
            System.out.println(s);
        }
    }
}
