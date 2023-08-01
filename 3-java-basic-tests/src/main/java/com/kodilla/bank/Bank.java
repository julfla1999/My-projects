package com.kodilla.bank;

public class Bank {

    private CashMachine[] cashMachines;
    private int size;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
        this.size = cashMachines.length;
    }


    public void add() {
        this.size++;
        CashMachine[] newBank = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newBank, 0, cashMachines.length);
        newBank[this.size - 1] = new CashMachine();
        this.cashMachines = newBank;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int getSaldoOfAllCashMachines() {
        int saldo = 0;
        for(int i = 0; i < this.size; i++) {
            saldo += cashMachines[i].getSaldo();
        }
        return saldo;

    }

    public int getNumberOfAllWithdraws() {
        int number = 0;
        for (int i = 0; i < this.size; i++) {
            number += cashMachines[i].getNumberOfWithdraws();
        }
        return number;
    }

    public int getNumberOfAllDeposits() {
        int number = 0;
        for (int i = 0; i < this.size; i++) {
            number += cashMachines[i].getNumberOfDeposits();
        }
        return number;
    }

    public double getAverageOfWithdraws() {
        int sum = 0;
        double average = 0;
        for ( int i = 0; i < this.size; i++) {
            sum += cashMachines[i].getSumOfWithdraws();
        }
        average = ((double)sum) / getNumberOfAllWithdraws();
        return average;
    }

    public double getAverageOfDeposits() {
        int sum = 0;
        double average = 0;
        for ( int i = 0; i < this.size; i++) {
            sum += cashMachines[i].getSumOfDeposits();
        }
        average = ((double)sum) / getNumberOfAllDeposits();
        return average;
    }



}
