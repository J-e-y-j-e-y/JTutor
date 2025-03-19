package homework.oop.interface_homework.task_1;

public class KelvinConverter implements Converter{
    @Override
    public double convert(double baseValue) {
        return baseValue + 273.15;
    }
}
