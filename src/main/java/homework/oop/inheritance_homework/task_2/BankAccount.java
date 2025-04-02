package homework.oop.inheritance_homework.task_2;

public class BankAccount {
    private int accountNumber;
    protected double balance;
    private String ownerName;

    public BankAccount(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("На счете осталось %.2f руб.", balance);
        } else {
            throw new Exception("Недостаточно денег на счете!");
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
