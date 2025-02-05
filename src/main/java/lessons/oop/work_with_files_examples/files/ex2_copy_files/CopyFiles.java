package lessons.oop.work_with_files_examples.files.ex2_copy_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFiles {
    public static void main(String[] args) throws IOException {
        String resourcesDir = "src/main/resources/lessons/oop/work_with_files_examples/";

        //создание файла
        Path testFile1 =
                Files.createFile(
                        Paths.get(resourcesDir + "testFile111.txt"));

        System.out.println("Был ли файл успешно создан?");
        System.out.println(
                Files.exists(
                        Paths.get(resourcesDir + "testFile111.txt")));

        //создание директории
        Path testDirectory2 = Files.createDirectory(
                Paths.get(resourcesDir + "testDirectory2"));

        System.out.println("Была ли директория успешно создана?");
        System.out.println(
                Files.exists(
                        Paths.get(resourcesDir + "testDirectory2")));

        //копируем файл с рабочего стола в директорию
        Path path = Files.copy(testFile1,
                Paths.get(resourcesDir + "testDirectory2\\testFile111.txt"),
                REPLACE_EXISTING);
        System.out.println("Остался ли наш файл в той же папке?");
        System.out.println(
                Files.exists(
                        Paths.get(resourcesDir + "testFile111.txt")));

        System.out.println("Был ли наш файл скопирован в testDirectory?");
        System.out.println(
                Files.exists(
                        Paths.get(resourcesDir + "testDirectory2\\testFile111.txt")));
    }
}
