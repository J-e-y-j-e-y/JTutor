package lessons.oop.this_and_super_examples.ex2;

public class Child extends Parent {
    void test()
    {
        System.out.println(super.a);

        System.out.println(super.b);
    }

    public static void main(String[] args)
    {
        // будет ошибка из-за super.a = 700 - нельзя использовать в статическом контексте
        //super.a = 700;

        new Child().test();
        int a1 = new Child().a;
        int b1 = Child.b;
    }
}
