package lessons.oop.nested_classes_examples.anonymous_classes_ex.ex1;

public class Main {
    private static int currentErrorsCount = 23;

    public static void main(String[] args) {
        GeneralIndicatorsMonitoringModule generalModule = new GeneralIndicatorsMonitoringModule();
        ErrorMonitoringModule errorModule = new ErrorMonitoringModule();
        SecurityModule securityModule = new SecurityModule();

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();

        MonitoringSystem workLoadModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Нагрузочный модуль выполняет мониторинг");
                System.out.println("Число ошибок: " + currentErrorsCount);
            }
        };
        workLoadModule.startMonitoring();
    }
}
