package homework.oop.nested_classes_homework.static_nested_classes_homework.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestWarehouse {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addProduct("Хлеб", 50, 100);
        warehouse.addProduct("Молоко", 80, 60);
        warehouse.addProduct("Яйца", 140, 500);

        List<Integer> productIndexes = Arrays.asList(0, 1, 2);
//        productIndexes.add(0);
//        productIndexes.add(1);
//        productIndexes.add(2);

        double summa = warehouse.processOrder(productIndexes, "Вася");

        System.out.printf("Общая сумма заказа - %s", summa);
    }
}
