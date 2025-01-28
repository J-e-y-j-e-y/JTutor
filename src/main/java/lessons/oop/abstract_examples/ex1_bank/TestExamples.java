package lessons.oop.abstract_examples.ex1_bank;

public class TestExamples {
    public static void main(String[] args) {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();

        Dev2 d1 = new Dev3();
    }
}
