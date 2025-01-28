package lessons.oop.this_and_super_examples;

public class TrickyExample {
    int first = 22;
    int second = 33;

    void testOne(int a, int b)
    {
        a = this.first;
        b = this.second;
        System.out.println(first);
        System.out.println(second);
        System.out.println(a);
        System.out.println(b);
    }

    void testTwo(int m, int n)
    {
        this.first = m;
        this.second = n;
        System.out.println(first);
        System.out.println(second);
        System.out.println(m);
        System.out.println(n);
    }

    public static void main(String[] args)
    {
        new TrickyExample().testOne(100, 200);
        new TrickyExample().testTwo(1, 2);
    }
}
