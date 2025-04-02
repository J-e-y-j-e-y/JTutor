package homework.oop.inheritance_homework.task_2;

public class SavingsAccount extends BankAccount {
    private double interestRate;


    public SavingsAccount(int accountNumber, double balance, String ownerName, double interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        super.withdraw(amount);
        balance += balance * interestRate / 100;
        System.out.printf("На счете %.2f руб.", balance);
    }
}
