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

    public int getPricePerPiece() {
        return pricePerPiece;
    }

    public static int getNumberOfFlowersSold() {
        return numberOfFlowersSold;
    }

    public static void increaseSoldFlowersCount() {
        numberOfFlowersSold++;
    }

}
