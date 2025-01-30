package lessons.oop.nested_classes_examples.static_nested_classes_ex.ex1;

public class MathOperations {
    // Вложенный статический класс для арифметических операций
    public static class Arithmetic {
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }
    }

    // Вложенный статический класс для тригонометрических операций
    public static class Trigonometry {
        public static double sin(double angle) {
            return Math.sin(angle);
        }

        public static double cos(double angle) {
            return Math.cos(angle);
        }
    }

    public static void main(String[] args) {
        // Использование арифметических операций
        int sum = MathOperations.Arithmetic.add(5, 3);
        int difference = MathOperations.Arithmetic.subtract(10, 4);
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);

        // Использование тригонометрических операций
        double sinValue = MathOperations.Trigonometry.sin(Math.PI / 2);
        double cosValue = MathOperations.Trigonometry.cos(0);
        System.out.println("Синус(π/2): " + sinValue);
        System.out.println("Косинус(0): " + cosValue);
    }
}
