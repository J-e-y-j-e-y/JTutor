package homework.oop.interface_homework.task_1;

public class FahrenheitConverter implements Converter{

    @Override
    public double convert(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
