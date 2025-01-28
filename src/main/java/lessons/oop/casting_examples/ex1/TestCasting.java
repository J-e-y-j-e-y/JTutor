package lessons.oop.casting_examples.ex1;

public class TestCasting {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();

        // ошибка
        // animal.fetch();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch();
        }
    }
}
