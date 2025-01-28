package lessons.oop.polymorphism_examples.usecase_2;

public class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");
    }

    public void fetch() {
        System.out.println("The cat plays with box");
    }
}
