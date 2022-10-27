package com.kodilla.bank.homework;

public class CashMachine {

    private int[] money;
    private int size;

    public CashMachine() {
        this.size = 1;
        this.money = new int[]{1000};
    }

    public void add(int value) {
        if( -getSaldo() > value ) {
            return;
        }
        if(value == 0) {
            return;
        }
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(money, 0, newTab, 0, money.length);
        newTab[this.size - 1] = value;
        this.money = newTab;
    }

    public int[] getMoney() {
        return money;
    }

    public int getSaldo() {
        int saldo = 0;
        for( int i=0; i < this.money.length; i++) {
            saldo += this.money[i];
        }
        return saldo;
    }

    public int getTransactionNumber() {
        int number = this.money.length - 1;
        return number;
    }

    public int getNumberOfDeposits() {
        int number = 0;
        for(int i=1; i < this.money.length; i++) {
            if( this.money[i] > 0 ) {
                number = number + 1;
            }
        }
        return number;
    }

    public int getNumberOfWithdraws() {
        return this.money.length - this.getNumberOfDeposits() -1;
    }

    public int getSumOfDeposits() {
        int sum = 0;
        for( int i=1; i < this.money.length; i++) {
            if (this.money[i] > 0) {
                sum += this.money[i];
            }
        }
        return sum;
    }

    public int getSumOfWithdraws() {
        int sum2 = 0;
        for( int i=1; i < this.money.length; i++) {
            if (this.money[i] < 0) {
                sum2 += this.money[i];
            }
        }
        return sum2;
    }
}
