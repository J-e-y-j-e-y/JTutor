package lessons.oop.polymorphism_examples.usecase_3;

import java.util.ArrayList;
import java.util.List;

public class TestExamples {
    public static void main(String[] args) {
        //List commands = new ArrayList<>();
        List<Command> commands = new ArrayList<>();

        commands.add(new PrintCommand());
        commands.add(new SaveCommand());

        for (Command command : commands) {
            command.execute();
        }
    }
}
