package lessons.oop.static_examples;

// https://www.geeksforgeeks.org/order-execution-initialization-blocks-constructors-java/

public class TrickyStaticInitializer {
    static {
        System.out.println("start static block");
        initialize();
    }

    private static int sum;

    public static int getSum() {
        initialize();
        return sum;
    }

    static {
        System.out.println("first " + TrickyStaticInitializer.initialized);
    }

    private static boolean initialized = false;

    static {
        System.out.println("second " + TrickyStaticInitializer.initialized);
    }

    private static void initialize() {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i; // 4950
            initialized = true;
        }
    }

    public static void main(String[] args) {
        System.out.println(TrickyStaticInitializer.getSum());
    }
}
