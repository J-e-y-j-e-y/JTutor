package homework.oop.interface_homework.task_1;

public class KelvinConverter implements Converter {
    Degree degree;

    @Override
    public double convert(double baseValue) {
        return baseValue + 273.15;

    }
}
