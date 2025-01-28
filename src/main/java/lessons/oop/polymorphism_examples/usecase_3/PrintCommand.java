package lessons.oop.polymorphism_examples.usecase_3;

public class PrintCommand implements Command{

    @Override
    public void execute() {
        System.out.println("print command");
    }
}
