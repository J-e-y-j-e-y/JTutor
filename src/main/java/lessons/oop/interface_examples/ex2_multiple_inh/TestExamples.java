package lessons.oop.interface_examples.ex2_multiple_inh;

public class TestExamples {
    public static void main(String[] args) {
        Calculator x = new Calculator();

        System.out.println("Addition : " + x.add(2,1));
        System.out.println("Substraction : " + x.sub(2,1));
    }
}
