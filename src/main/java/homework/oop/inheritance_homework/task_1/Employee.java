package homework.oop.inheritance_homework.task_1;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void work() {
        System.out.println("Виртуальный сотрудник работает!");
    }

    @Override
    public String toString() {
        return String.format("%s получает ЗП - %s\n", name, salary);
    }
}
