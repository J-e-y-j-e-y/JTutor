package lessons.oop.nested_classes_examples.anonymous_classes_ex.ex1;

public class SecurityModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал!");
    }
}
