import accounts.CheckingAccount;
import accounts.SavingsAccount;
import clients.Client;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Oleg", 2);
        client1.addAcc(new SavingsAccount(1000, 2000, "Kopilka"));
        client1.addAcc(new CheckingAccount(1000, "Money"));
        client1.addAcc(new CheckingAccount(1000, "Money2"));
        client1.pay(5000);
        System.out.println("----------------");
        client1.pay(100);
    }
}