package homework.oop.abstract_homework.task_1;

public class Main {
    //static Logger logger = new FileLogger();
    static Logger logger = new ConsoleLogger();
    public static void main(String[] args) {
        logger.logMessage("Моё сообщение!");
    }
}
