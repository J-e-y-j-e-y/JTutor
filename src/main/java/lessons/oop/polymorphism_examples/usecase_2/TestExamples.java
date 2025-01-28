package lessons.oop.polymorphism_examples.usecase_2;

import java.util.ArrayList;
import java.util.List;

public class TestExamples {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Cat());
        animalList.add(new Dog());

        for (Animal animal : animalList) {
            animal.makeSound();
        }
    }
}
