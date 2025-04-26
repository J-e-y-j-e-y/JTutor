package homework.oop.interface_homework.task_1;

public interface Converter {
    double convert(double baseValue);

    static Converter getInstance(Degree degree) {
        return switch (degree) {
            case KELVIN -> new KelvinConverter();
            case CELSIUS -> new CelsiusConverter();
            case FAHRENHEIT -> new FahrenheitConverter();
        };
    }
}
