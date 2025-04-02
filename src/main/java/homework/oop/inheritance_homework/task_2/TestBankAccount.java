package homework.oop.inheritance_homework.task_2;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, 10000, "Денис");

        try {
            account1.withdraw(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        SavingsAccount saccont2 = new SavingsAccount(2, 30000, "Иван", 12);

        try {
            saccont2.withdraw(31000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
