package homework.oop.inheritance_homework.task_2;

public class SavingsAccount extends BankAccount {
    private float interestRate;

    public SavingsAccount(String owner, float balance, float interestRate) {
        super(owner, balance); // то есть, я могу использовать те же названия
        this.interestRate = interestRate;
    }

    @Override
    public float withdraw(int amount) {
        float actualBalance = getBalance();
        float currentBalance = super.withdraw(amount);
        if (currentBalance < actualBalance) {
            float balanceWithInterest = currentBalance * (1 + interestRate / 100);
            setBalance(balanceWithInterest);
        }
        return getBalance();
    }
}
