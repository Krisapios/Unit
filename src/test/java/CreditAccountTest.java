import accounts.CreditAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditAccountTest {

    @Test
    @DisplayName("Баланс на кредитке не должен быть положительным")
    void creditAccTest() {
        CreditAccount credit1 = new CreditAccount(-500, "CreditAcc");
        assertEquals(false, credit1.add(1000));
    }
}
