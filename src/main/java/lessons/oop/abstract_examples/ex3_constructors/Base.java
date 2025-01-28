package lessons.oop.abstract_examples.ex3_constructors;

public abstract class Base {
    int b;
    Base() {
        System.out.println("Base Constructor Called");
        b = 22;
        System.out.println(b);
    }

    abstract void fun();
}
