package lessons.oop.casting_examples.ex1;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void fetch() {
        System.out.println("The dog fetches a ball");
    }

    public static void helper() {

    }
}
