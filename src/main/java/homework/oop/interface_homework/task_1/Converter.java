package homework.oop.interface_homework.task_1;

public interface Converter {
    double convert(double baseValue);

    public static Converter getInstance(Degree degree) {
        // TODO
        // в зависимости от degree (CELSIUS,FAHRENHEIT, KELVIN)
        // верни конкретный экземпляр нужного класса
        if (Degree.CELSIUS == degree) return new CelsiusConverter();
        if (Degree.KELVIN == degree) return new KelvinConverter();
        if (Degree.FAHRENHEIT == degree) return new FahrenheitConverter();
        return null;
    }
}
