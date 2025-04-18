package homework.oop.nested_classes_homework.inner_classes_homework.task_1;

public class Main {
    public static void main(String[] args) {
        User user = new User("log1", "pass1");
        user.createQuery();
        User.Query query1 = new User("log2", "pass2").new Query();
        query1.printToLog();
        User.Query query2 = user.new Query();
        query2.printToLog();
    }
}
