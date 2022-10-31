package accounts;

public class SavingsAccount extends Account {
    private long minBalance;

    public SavingsAccount(long minBalance, long balance, String name) {
        super(balance, name);
        this.minBalance = minBalance;
    }

    public boolean pay(long amount) {
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println("Счет уменьшился на " + amount + " Баланс: " + getBalance());
            return true;
        }
        return false;
    }
}

