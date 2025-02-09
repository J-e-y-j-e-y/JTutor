package homework.oop.inheritance_homework.task_2;

public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Alexey", 30000, 2.5F);

        // Текущий баланс
        System.out.println("Баланс вашего счета: " + acc.getBalance());
        System.out.println("========================================");

        // Успешное снятие наличных и начисление % на остаток
        System.out.println("Баланс после начисления: " + acc.withdraw(10000));
        System.out.println("========================================");

        // Неуспешное снятие наличных
        System.out.println("Баланс после начисления: " + acc.withdraw(25000));

    }
}
