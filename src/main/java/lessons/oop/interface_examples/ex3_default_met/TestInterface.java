package lessons.oop.interface_examples.ex3_default_met;

// interfaces can have methods from JDK 1.8 onwards
public interface TestInterface {
    int a = 10;

    default void display() {
        System.out.println("hello");
    }

    static void staticDisplay() {
        System.out.println("static hello");
    }
}
