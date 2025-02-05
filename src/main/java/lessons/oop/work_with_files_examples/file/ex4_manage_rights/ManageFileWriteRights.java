package lessons.oop.work_with_files_examples.file.ex4_manage_rights;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManageFileWriteRights {
    public static void main(String[] args) {
        String localDirPath = "src/main/java/lessons/oop/work_with_files_examples/file/ex4_manage_rights";
        File parentDir = makeDir(localDirPath + "/readDir");

        File child = new File(parentDir, "file.txt");
        try {
            child.createNewFile();
        } catch (IOException e) {
            System.out.println("Could not create " + child.getName());
        }
        boolean writable = child.setWritable(false);

        try (FileOutputStream fos = new FileOutputStream(child)) {
            fos.write("Hello World".getBytes()); // write operation
            fos.flush();
        } catch (IOException e) {
            System.out.println("не вышло записать сообщение в файл");
        }
    }

    public static File makeDir(String dirName) {
        File directory = new File(dirName);
        boolean dirCreated = directory.mkdir();
        System.out.println(dirCreated ? "директория создана" : "не получилось создать директорию");
        return directory;
    }
}
