package lessons.oop.abstract_examples.ex3_constructors;

public class Derived extends Base {
    int b;
    Derived() {
        System.out.println(super.b);
        System.out.println(b);
        System.out.println("Derived Constructor Called");
        b = 1;
        System.out.println(b);
    }

    void fun() {
        System.out.println("Derived fun() called");
    }
}
