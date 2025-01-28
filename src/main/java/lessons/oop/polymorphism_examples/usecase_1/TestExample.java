package lessons.oop.polymorphism_examples.usecase_1;

public class TestExample {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Upcasting

        Shape shape = new Circle();

        Circle myCircle = (Circle) shape; // Downcasting
        myCircle.circle();
    }
}
