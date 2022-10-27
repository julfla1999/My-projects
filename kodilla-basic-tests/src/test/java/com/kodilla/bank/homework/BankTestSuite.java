package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldAddCashMachineToTheBank() {

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3};
        Bank bank = new Bank(cashMachines);
        assertEquals(3, cashMachines.length);

    }

    @Test
    public void shouldCountSaldoOfTheBank() {

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(500);
        cashMachine2.add(-300);
        cashMachine3.add(-2000);
        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3};
        Bank bank = new Bank(cashMachines);
        assertEquals(3200, bank.getSaldoOfAllCashMachines());
//        bank.add();
//        bank.getCashMachines()[3].add(400);
//        assertEquals(4600, bank.getSaldoOfAllCashMachines());
    }

    @Test
    public void shouldCountNumberOfAllWithdraws() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-300);
        cashMachine2.add(-300);
        cashMachine3.add(-2000);
        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3};
        Bank bank = new Bank(cashMachines);
        assertEquals(2, bank.getNumberOfAllWithdraws());
    }

    @Test
    public void shouldCountNumberOfAllDeposits() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-300);
        cashMachine2.add(-300);
        cashMachine2.add(1300);
        cashMachine3.add(600);
        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3};
        Bank bank = new Bank(cashMachines);
        assertEquals(3, bank.getNumberOfAllDeposits());
    }

    @Test
    public void shouldCountAverageOfAllWithdraws() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-250);
        cashMachine2.add(-300);
        cashMachine2.add(-1000);
        cashMachine3.add(-700);
        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3};
        Bank bank = new Bank(cashMachines);
        assertEquals(-416.666, bank.getAverageOfWithdraws(), 0.001);
    }

    @Test
    public void shouldCountAverageOfAllDeposits() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(500);
        cashMachine1.add(-300);
        cashMachine2.add(-300);
        cashMachine2.add(1300);
        cashMachine3.add(600);
        cashMachine3.add(150);
        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3};
        Bank bank = new Bank(cashMachines);
        assertEquals(637.5, bank.getAverageOfDeposits(), 0.001);
    }
}
