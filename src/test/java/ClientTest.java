import accounts.CheckingAccount;
import accounts.SavingsAccount;
import clients.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ClientTest {

    @Test
    @DisplayName("Максимальное количество счетов")
    void maxAccTest() {
        Client clientGena = new Client("Gena", 1);
        clientGena.addAcc(new SavingsAccount(1000, 2000, "GenaSaveMoney"));
        CheckingAccount genaCheck = new CheckingAccount(1000, "GenaCheckMoney");
        assertFalse(clientGena.addAcc(genaCheck));
    }
}
