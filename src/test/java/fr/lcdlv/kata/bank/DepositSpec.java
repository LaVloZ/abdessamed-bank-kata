package fr.lcdlv.kata.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DepositSpec {

    @Test
    public void depositMoneyOnAccount() {
        Money money = Money.of(1);
        Account account = new Account();

        account.deposit(money);

        Money balance = account.getBalance();
        Assertions.assertEquals(Money.of(1), balance);
    }
}