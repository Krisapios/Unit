package accounts;

public class Account {
    protected long balance;
    protected String name;

    public Account(long balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public boolean pay(long amount) {
        if ((balance - amount) >= 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Cчет пополнен на " + amount + " Баланс: " + getBalance());
            return true;
        }
        return false;
    }
}
