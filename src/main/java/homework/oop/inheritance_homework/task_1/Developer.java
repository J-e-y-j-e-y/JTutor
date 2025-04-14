package homework.oop.inheritance_homework.task_1;

public class Developer extends Employee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.printf("Разработчик %s думает головой за всех!\n", getName());
    }

    @Override
    public String toString() {
        return String.format("%s получает ЗП - %s\n", getName(), getSalary());
    }
}
