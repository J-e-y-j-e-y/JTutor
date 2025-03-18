package homework.oop.static_homework.task_1;

import java.util.List;

public class Flower {
    private static int numberOfFlowersSold;
    private String name;
    private String countryOfOrigin;
    private int shelfLifeInDays;
    private int pricePerPiece;

    public Flower(String name, String countryOfOrigin, int shelfLifeInDays, int pricePerPiece) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.shelfLifeInDays = shelfLifeInDays;
        this.pricePerPiece = pricePerPiece;
    }

    // расчитываем стоимости букета и считаем количество проданных цветов
    public static int cost(List<Flower> flowers) {
        int bouquetCost = 0;
        for (Flower flower : flowers) {
            bouquetCost += flower.pricePerPiece;
            // Увеличиваем количество проданных цветов
            numberOfFlowersSold++;
        }
        return bouquetCost;
    }

    public static int getNumberOfFlowersSold() {
        return numberOfFlowersSold;
    }

}
