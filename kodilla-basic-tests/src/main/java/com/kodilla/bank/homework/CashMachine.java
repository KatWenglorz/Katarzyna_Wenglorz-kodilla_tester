package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;

    public CashMachine() {
        this.values = new int[0];
        this.size = 0;
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }
    public int[] getValues() {
        return values;
    }
    public int getBalance() {
        if (this.values.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum;
    }
    public int getNumberOfTransactions() {
        return this.values.length;
    }
}

