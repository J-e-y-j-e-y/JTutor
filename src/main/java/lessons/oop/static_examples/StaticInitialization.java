package lessons.oop.static_examples;

public class StaticInitialization {
    StaticInitialization(int x) {
        System.out.println("ONE argument constructor");
    }

    StaticInitialization() {
        System.out.println("No  argument constructor");
    }

    static {
        System.out.println("1st static init");
    }

    {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }

    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args)
    {
        new StaticInitialization();
        new StaticInitialization(8);
    }
}
