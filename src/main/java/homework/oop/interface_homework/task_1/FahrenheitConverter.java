package homework.oop.interface_homework.task_1;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double baseValue) {
        return (9.0 / 5.0) * baseValue + 32; // чтобы избежать целочисленное деление
    }
}
