package homework.oop.static_homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // букет 1
        List<Flower> bouquet1 = new ArrayList<Flower>();
        bouquet1.add(new Carnation("Гвоздика", "Россия", 7, 100.0));
        bouquet1.add(new Carnation("Гвоздика", "Россия", 7, 100.0));
        bouquet1.add(new Rose("Роза", "Китай", 10, 200.0));

        //букет 2
        List<Flower> bouquet2 = new ArrayList<Flower>();
        bouquet2.add(new Rose("Роза", "Китай", 10, 200.0));
        bouquet2.add(new Rose("Роза", "Китай", 10, 200.0));
        bouquet2.add(new Tulip("Тюльпан", "Нидерланды", 10, 150.0));

        //букет 3
        List<Flower> bouquet3 = new ArrayList<Flower>();
        bouquet3.add(new Tulip("Тюльпан", "Нидерланды", 10, 150.0));
        bouquet3.add(new Tulip("Тюльпан", "Нидерланды", 10, 150.0));
        bouquet3.add(new Carnation("Гвоздика", "Россия", 7, 100.0));

        System.out.println(Flower.calculateCost(bouquet1));
        System.out.println(Flower.calculateCost(bouquet2));
        System.out.println(Flower.calculateCost(bouquet3));

        System.out.println(Flower.calculateFlowersSoldItems(bouquet1));
        System.out.println(Flower.calculateFlowersSoldItems(bouquet2));
        System.out.println(Flower.calculateFlowersSoldItems(bouquet3));
    }
}
