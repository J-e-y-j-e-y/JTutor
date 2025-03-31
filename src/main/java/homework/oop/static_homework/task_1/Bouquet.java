package homework.oop.static_homework.task_1;

import java.util.List;

public class Bouquet {
    private List<Flower> bouquet;

    public Bouquet(List<Flower> bouquet) {
        this.bouquet = bouquet;
    }

    public int cost() {
        int bouquetCost = 0;
        for (Flower flower : bouquet) {
            bouquetCost += flower.getPricePerPiece();
            // Увеличиваем количество проданных цветов
            Flower.increaseSoldFlowersCount();
        }
        return bouquetCost;
    }
}
