import accounts.CheckingAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckingAccountTest {
    @Test
    @DisplayName("Баланс на CheckingAccount не должен быть ниже 0")
    void checkAccTest() {
        CheckingAccount check1 = new CheckingAccount(1000, "CheckAcc");
        assertFalse(check1.pay(2000));
    }
}
