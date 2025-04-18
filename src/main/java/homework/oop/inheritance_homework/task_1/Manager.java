package homework.oop.inheritance_homework.task_1;

public class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.printf("Менеджер %s руководит всеми!\n", getName());
    }

    @Override
    public String toString() {
        return String.format("%s получает ЗП - %s\n", getName(), getSalary());
    }
}
