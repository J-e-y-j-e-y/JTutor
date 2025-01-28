package lessons.oop.casting_examples;

public class CastingExamples {
    public static void main(String[] args) {
        wideningExample();
    }

    public static void wideningExample() {
        int i = 10;

        // Wideing TypeCasting (Automatic Casting)
        // from int to long
        long l = i;

        // Wideing TypeCasting (Automatic Casting)
        // from int to double
        double d = i;

        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
    }

    public static void narrowingExample() {
        double i = 100.245;

        // Narrowing Type Casting
        short j = (short)i;
        int k = (int)i;

        System.out.println("Original Value before Casting"
                + i);
        System.out.println("After Type Casting to short "
                + j);
        System.out.println("After Type Casting to int "
                + k);
    }
}
