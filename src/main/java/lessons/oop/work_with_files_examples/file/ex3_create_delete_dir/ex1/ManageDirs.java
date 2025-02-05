package lessons.oop.work_with_files_examples.file.ex3_create_delete_dir.ex1;

import java.io.File;
import java.io.IOException;

public class ManageDirs {
    public static void main(String[] args) {
        File directory = new File("src/main/java/lessons/oop/work_with_files_examples/file/ex3_create_delete_dir/ex1/dir");
        directory.mkdir();
        File file = new File(directory.getAbsolutePath() + "/file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Could not create " + "file.txt");
        }
//        boolean deletedDir = deleteDir(directory);
//        System.out.println(deletedDir ? "каталог удален" : "каталог не удален"); // не вышло, потому что можно удалять только пустые каталоги
//        boolean deletedFile = deleteFile(file);
//        System.out.println(deletedFile ? "файл удален" : "файл не удален");
    }

    public static boolean deleteDir(File directory) {
        return directory.delete();
    }

    public static boolean deleteFile(File file) {
        return file.delete();
    }
}
