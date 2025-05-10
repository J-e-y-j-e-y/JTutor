package homework.oop.inheritance_homework.task_2;

import lessons.oop.interface_examples.ex4_extend_interf.B;

public class BankAccount {
    static int accountCounter = 1;
    private int accountNumber;
    private float balance;
    private String ownerName;

    public BankAccount(String ownerName, float balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountNumber = BankAccount.accountCounter++;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public float withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Недостаточно средств. " + "Текущий баланс: " + getBalance() + " Сумма для снятия: " + amount);
        } else {
            System.out.println("Выдача наличных успешно: " + amount);
            setBalance(amount);
        }
        return getBalance();
    }
}
