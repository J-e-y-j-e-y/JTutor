package homework.oop.nested_classes_homework.inner_classes_homework.task_1;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.println("Пользователь " + login + " отправил запрос");
        }
    }

    public static void main(String[] args) {
        User user = new User("login_1", "qwerty");
        user.createQuery();

        // не могут быть созданы без объекта внешнего класса
        User.Query query_1 = user.new Query();
        User.Query query_2 = new User("login_2", "asdfg").new Query();
    }
}
