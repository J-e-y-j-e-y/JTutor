package homework.oop.interface_homework.task_1;

public class Main {
    public static void main(String[] args) {
        double temperature = 23.5;

        // раскомментируй и сделай так, чтобы работало
        System.out.println("t = " +
                new CelsiusConverter().convert(temperature));
        System.out.println("t = " +
                new KelvinConverter().convert(temperature));
        System.out.println("t = " +
                new FahrenheitConverter().convert(temperature));

        // дополнительно
        Converter fahrenheitConverter = Converter.getInstance(Degree.FAHRENHEIT);
        System.out.println("t = " +
                fahrenheitConverter.convert(temperature));
    }
}
