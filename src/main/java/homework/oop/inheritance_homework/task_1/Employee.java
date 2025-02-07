package homework.oop.inheritance_homework.task_1;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(getName() + " is working");

    }
}
