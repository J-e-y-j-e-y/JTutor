package homework.oop.nested_classes_homework.local_classes_homework.task_1;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query  {
            final

            public void printToLog() {
                System.out.printf("Пользователь с логином %s отправил запрос", login);
            }
        }

        new Query().printToLog();
    }

}
