package lessons.oop.work_with_files_examples.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsExample {
    public static void main(String[] args) {
        Path testFilePath =
                Paths.get("src/main/resources/lessons/oop/work_with_files_examples/testFile.txt");
        System.out.println(testFilePath.getFileName());
    }
}
