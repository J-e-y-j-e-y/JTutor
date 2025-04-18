package homework.oop.inheritance_homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class TestDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee("Виртуальный сотрудник", 0);
        Manager manager = new Manager("Витя", 120000);
        Developer developer = new Developer("Саша", 250000);

        employees.add(employee);
        employees.add(manager);
        employees.add(developer);

        for (Employee emmploee : employees) {
            emmploee.work();
            System.out.println(emmploee);
        }
    }
}
