package lessons.oop.work_with_files_examples.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path testFilePath =
                Paths.get("src/main/resources/lessons/oop/work_with_files_examples/testFile.txt");

        Path fileName = testFilePath.getFileName();
        System.out.println(fileName);

        Path parent = testFilePath.getParent();
        System.out.println(parent);

        Path root = testFilePath.getRoot();
        System.out.println(root);

        boolean endWithTxt = testFilePath.endsWith("Desktop\\testFile.txt");
        System.out.println(endWithTxt);

        boolean startsWithLalala = testFilePath.startsWith("lalalala");
        System.out.println(startsWithLalala);

        // check is path absolute
        boolean isAbsolute = testFilePath.isAbsolute();
        System.out.println(isAbsolute);

        // normalize() example
        Path path5 = Paths.get("C:\\Users\\Java\\.\\examples");
        System.out.println(path5.normalize());

        Path path6 = Paths.get("C:\\Users\\Java\\..\\examples");
        System.out.println(path6.normalize());

        // relative path example
        Path testFilePath1 = Paths.get("C:\\Users\\Users\\Users\\Users");
        Path testFilePath2 =
                Paths.get("C:\\Users\\Users\\Users\\Users\\Username\\Desktop\\testFile.txt");

        System.out.println(testFilePath1.relativize(testFilePath2));


    }


}
