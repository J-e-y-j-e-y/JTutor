package lessons.oop.interface_examples.ex3_default_met;

public class TestClass implements TestInterface{
    public static void main (String[] args) {
        TestClass t = new TestClass();
        t.display();

        TestInterface.staticDisplay();

        // не работают
        // t.staticDisplay();
        // TestClass.staticDisplay();
    }
}
