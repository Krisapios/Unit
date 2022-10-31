package accounts;

public class CreditAccount extends Account {

    public CreditAccount(long balance, String name) {
        super(balance, name);
    }


    public boolean add(long amount) {
        if ((balance + amount) > 0) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    public boolean pay(long amount) {
        if ((balance - amount) <= 0) {
            balance -= amount;
            System.out.println("Счет уменьшился на " + amount + " Баланс: " + getBalance());
            return true;
        }
        return false;
    }
}
