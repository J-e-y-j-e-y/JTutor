package lessons.oop.abstract_examples.ex4_not_really_abstract;


public class TestExamples {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();

        // ошибка - все равно нельзя создать экземпляр абстрактного класса
        // Base base = new Base();

        Base b = new Derived();
        b.fun();
    }
}
