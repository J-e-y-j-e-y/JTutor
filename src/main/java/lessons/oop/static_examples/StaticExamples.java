package lessons.oop.static_examples;

public class StaticExamples {
    static int count;
    int nonStaticCount;

    public static void invokeCounter() {
        count++;
        System.out.println("Текущее значение счётчика - " + count);
    }

    public static void invokeNonStaticCounter() {
        // ошибка :
        //nonStaticCount++;
        //System.out.println("Текущее значение счётчика - " + nonStaticCount);

        StaticExamples examples = new StaticExamples();
        examples.nonStaticCount++;
        int count = examples.nonStaticCount;
        System.out.println("Текущее значение счётчика - " + count);
        System.out.println("Текущее значение static счётчика - " + StaticExamples.count);
    }

    public static void main(String[] args) {
        StaticExamples.invokeCounter();
        StaticExamples.invokeCounter();
        StaticExamples.invokeCounter();

        //--------------------------------
        System.out.println();
        StaticExamples.invokeNonStaticCounter();
    }
}
