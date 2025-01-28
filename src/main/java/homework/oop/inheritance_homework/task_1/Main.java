package homework.oop.inheritance_homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Employee> employees = new ArrayList<Employee>();

        employees.add(new Manager("John", 50000));
        employees.add(new Developer("Jane", 60000));
        employees.add(new Employee("Jack", 70000));

        for (Employee employee : employees) {
            employee.work();
        }
    }
}
