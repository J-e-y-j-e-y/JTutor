package homework.oop.nested_classes_homework.static_nested_classes_homework.task_2;

import java.io.IOException;
import java.util.List;

public class TestConfiguyration {
    public static void main(String[] args) throws IOException {
        List<Configuration.ConfigParameter> load = Configuration.ConfigLoader.load("src/main/java/homework/oop/nested_classes_homework/static_nested_classes_homework/task_2/config2.properties");
        for (Configuration.ConfigParameter elem : load) {
            System.out.println(elem);
        }
    }
}
