package homework.oop.inheritance_homework.task_1;

public class Developer extends Employee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Developer " + getName() + " works for a salary " + getSalary() );
    }
}
