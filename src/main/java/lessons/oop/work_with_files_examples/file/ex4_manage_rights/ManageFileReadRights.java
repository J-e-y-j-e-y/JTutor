package lessons.oop.work_with_files_examples.file.ex4_manage_rights;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ManageFileReadRights {
    public static void main(String[] args) {
        String localDirPath = "src/main/java/lessons/oop/work_with_files_examples/file/ex4_manage_rights";
        File parentDir = new File(localDirPath + "/writeDir");

        File child = new File(parentDir, "file.txt");

        boolean readable = child.setReadable(false);
        System.out.println(readable);
        try (FileInputStream fis = new FileInputStream(child)) {
            System.out.println(child.canRead());
            int read = fis.read();// read operation
            System.out.println(read);
        } catch (IOException e) {
            System.out.println("не вышло прочитать сообщение из файла");
        }
    }

    public static File makeDir(String dirName) {
        File directory = new File(dirName);
        boolean dirCreated = directory.mkdir();
        System.out.println(dirCreated ? "директория создана" : "не получилось создать директорию");
        return directory;
    }
}
