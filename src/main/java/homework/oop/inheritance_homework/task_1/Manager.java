package homework.oop.inheritance_homework.task_1;

public class Manager extends Employee {


    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Manager " + super.getName() + " works for a salary "  + getSalary());
    }
}
