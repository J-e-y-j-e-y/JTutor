package lessons.oop.polymorphism_examples.usecase_5;

public class Human implements Eater, Sleeper{
    @Override
    public void eat() {
        System.out.println("The human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The human is sleeping.");
    }
}
