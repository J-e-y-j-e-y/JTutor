package lessons.oop.work_with_files_examples.walk_file_tree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        List<String> lines = Files.readAllLines(file);

        for (String s : lines) {
            if (s.contains("This is the file we need")) {
                System.out.println("Нужный файл обнаружен!");
                System.out.println(file.toAbsolutePath());
                break;
            }
        }

        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("src/main/resources/lessons/oop/work_with_files_examples/testFolder"),
                new MyFileVisitor());
    }
}
