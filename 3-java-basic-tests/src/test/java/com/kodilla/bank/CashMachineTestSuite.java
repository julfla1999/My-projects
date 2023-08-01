package com.kodilla.bank;

import com.kodilla.bank.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveOneElement() {
        CashMachine cashMachine = new CashMachine();
        int[] money = cashMachine.getMoney();
        assertEquals(1, money.length);
    }

    @Test
    public void shouldStartWith1000Saldo() {
        CashMachine cashMachine = new CashMachine();
        int[] money = cashMachine.getMoney();
        assertEquals(1000, money[0]);
    }

    @Test
    public void shouldLetTransactionsIfThereIsEnoughMoney() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1001);
        cashMachine.add(-500);
        cashMachine.add(1500);
        cashMachine.add(-2000);
        cashMachine.add(-100);
        cashMachine.add(0);

        int[] money = cashMachine.getMoney();
        assertEquals(4, money.length);
        assertEquals(-500, money[1]);
        assertEquals(1500, money[2]);
        assertEquals(-2000, money[3]);

    }

    @Test
    public void shouldCountSaldo() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1001);
        cashMachine.add(-500);
        cashMachine.add(1500);
        cashMachine.add(-2000);
        cashMachine.add(300);

        assertEquals(300, cashMachine.getSaldo());
    }

    @Test
    public void shouldCountTransactionNumber() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1001);
        cashMachine.add(-500);
        cashMachine.add(1500);
        cashMachine.add(-2000);
        cashMachine.add(300);

        assertEquals(4, cashMachine.getTransactionNumber());

    }

    @Test
    public void shouldCountNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1001);
        cashMachine.add(-500);
        cashMachine.add(1500);
        cashMachine.add(-2000);
        cashMachine.add(300);

        assertEquals(2,cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldCountNumberOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1001);
        cashMachine.add(-500);
        cashMachine.add(1500);
        cashMachine.add(-2000);
        cashMachine.add(300);

        assertEquals(2, cashMachine.getNumberOfWithdraws());
    }

    @Test
    public void shouldCountSumOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1001);
        cashMachine.add(-500);
        cashMachine.add(1500);
        cashMachine.add(-2000);
        cashMachine.add(300);

        assertEquals(1800, cashMachine.getSumOfDeposits());
    }

    @Test
    public void shouldCountSumOfWithdraws() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1001);
        cashMachine.add(-500);
        cashMachine.add(1500);
        cashMachine.add(-2000);
        cashMachine.add(300);

        assertEquals(-2500, cashMachine.getSumOfWithdraws());
    }
}
