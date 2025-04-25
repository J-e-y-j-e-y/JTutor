package homework.oop.nested_classes_homework.static_nested_classes_homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Product> warehouse = new ArrayList<>();

    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    '}';
        }
    }


    public void addProduct(String name, double price, int quantity) {
        warehouse.add(new Product(name, price, quantity));
    }

    public void getProductInfo(int index) {
        warehouse.get(index).toString();
    }

    public double processOrder(List<Integer> productIndexes, String customerName) {
        double count = 0;

        for (int index : productIndexes) {
            count += warehouse.get(index).price;
        }

        return count;
    }

}
