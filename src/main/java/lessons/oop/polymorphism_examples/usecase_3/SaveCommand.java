package lessons.oop.polymorphism_examples.usecase_3;

public class SaveCommand implements Command{
    @Override
    public void execute() {
        System.out.println("save command");
    }
}
