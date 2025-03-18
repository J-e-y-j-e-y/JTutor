package homework.oop.static_homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class TestFlowers {

    public static void main(String[] args) {
        Rose rose1 = new Rose("Красная роза", "Голландия", 9, 350);
        Rose rose2 = new Rose("Белая роза", "Турция", 12, 325);
        Rose rose3 = new Rose("Желтая роза", "Испания", 11, 300);

        Tulip tulip1 = new Tulip("Желтый тюльпан", "Турция", 6, 200);
        Tulip tulip2 = new Tulip("Белый тюльпан", "Испания", 8, 180);
        Tulip tulip3 = new Tulip("Красный тюльпан", "Голландия", 10, 195);

        Carnation carnation1 = new Carnation("Красная гвоздика", "Голландия", 5, 125);
        Carnation carnation2 = new Carnation("Черная гвоздика", "Голландия", 5, 170);
        Carnation carnation3 = new Carnation("Фиолетовая гвоздика", "Голландия", 5, 190);

        // Собираем букеты
        List<Flower> bouquet1 = new ArrayList<>();
        bouquet1.add(rose1);
        bouquet1.add(rose2);
        bouquet1.add(carnation1);

        List<Flower> bouquet2 = new ArrayList<>();
        bouquet2.add(tulip1);
        bouquet2.add(rose1);
        bouquet2.add(rose3);
        bouquet2.add(carnation3);
        bouquet2.add(carnation2);

        List<Flower> bouquet3 = new ArrayList<>();
        bouquet3.add(carnation1);
        bouquet3.add(tulip1);
        bouquet3.add(rose1);
        bouquet3.add(tulip2);
        bouquet3.add(tulip3);
        bouquet3.add(carnation3);

        // Считаем стоимость каждого букета
        System.out.println("Стоимость букета 1: " + Flower.cost(bouquet1) + " руб.");
        System.out.println("Стоимость букета 2: " + Flower.cost(bouquet2) + " руб.");
        System.out.println("Стоимость букета 3: " + Flower.cost(bouquet3) + " руб.");

        // Подсчитываем общее количество проданных цветов
        System.out.println("Общее количество проданных цветов: " + Flower.getNumberOfFlowersSold());

    }

}
