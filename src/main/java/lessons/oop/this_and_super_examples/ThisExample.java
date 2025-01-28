package lessons.oop.this_and_super_examples;

public class ThisExample {
    int a = 10;

    static int b = 20;

    void example() {
        this.a = 100;

        System.out.println(a);

        this.b = 600;

        System.out.println(b);
    }

    public static void main(String[] args) {
        // будет ошибка
        // this.a = 700;
        b = 12; // нет ошибки
        new ThisExample().example();
    }
}
