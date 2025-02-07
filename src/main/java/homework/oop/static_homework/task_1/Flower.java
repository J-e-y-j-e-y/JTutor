package homework.oop.static_homework.task_1;

import java.util.List;

public class Flower {
    static int soldFlowersAmount = 0;
    private String title;
    private String origin;
    private int storagePeriod;
    private double pricePerItem;

    public Flower(String title, String origin, int storagePeriod, double pricePerItem) {
        this.title = title;
        this.origin = origin;
        this.storagePeriod = storagePeriod;
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public static double calculateCost(List<Flower> flowers) {
        double totalPrice = 0.0;
        for (Flower flower : flowers) {
            totalPrice += flower.getPricePerItem();
        }
        return totalPrice;
    }

    public static int calculateFlowersSoldItems(List flowers) {
        soldFlowersAmount += flowers.size();
        return soldFlowersAmount;
    }
}
