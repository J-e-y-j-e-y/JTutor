package homework.oop.nested_classes_homework.inner_classes_homework.task_1;

public class User {
    private String login;
    private String passport;

    public User(String login, String passport) {
        this.login = login;
        this.passport = passport;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логином %s отправил запрос!\n", login);
        }
    }
}
