package lessons.oop.nested_classes_examples.local_classes_ex.ex1;

import java.util.ArrayList;
import java.util.List;

public class RecursiveDataProcessor {
    static class DataNode {
        String data;
        List<DataNode> children;

        DataNode(String data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    public static String processTree(DataNode node) {
        // Локальный класс для представления ошибки
        class ProcessingError extends RuntimeException {
            String message;

            ProcessingError(String message) {
                this.message = message;
            }

            @Override
            public String getMessage() {
                return message;
            }
        }

        try {
            System.out.println("Обработка узла: " + node.data);
            // Проверка на ошибку. Замена на любую другую логику проверки
            if (node.data.contains("error")) {
                throw new ProcessingError("Ошибка в узле: " + node.data);
            }
            for (DataNode child : node.children) {
                processTree(child); // Рекурсивный вызов
            }
        } catch (ProcessingError e) {
            return "Ошибка: " + e.getMessage();
        }
        return "Обработка завершена успешно";
    }


    public static void main(String[] args) {
        DataNode root = new DataNode("Root");
        DataNode child1 = new DataNode("Child1");
        DataNode child2 = new DataNode("Child2");
        DataNode child3 = new DataNode("Child3");
        DataNode errorChild = new DataNode("errorChild");


        child1.children.add(errorChild);

        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        String result = processTree(root);
        System.out.println(result);
    }
}
