package clients;

import accounts.Account;

public class Client {
    protected String name;
    private Account[] accounts;

    public Client(String name, int maxAcc) {
        this.name = name;
        this.accounts = new Account[maxAcc];
    }

    public boolean addAcc(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return true;
            }
        }
        System.out.println("Кол-во аккаунтов ограничено");
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                System.out.println("Деньги списалсь со счета " + accounts[i].getName());
                return true;
            }
        }
        System.out.println("Недостаточно средств на счетах");
        return false;

    }
}

