package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[4];
        cashMachines[0] = new CashMachine();
        cashMachines[1] = new CashMachine();
        cashMachines[2] = new CashMachine();
        cashMachines[3] = new CashMachine();
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += cashMachines[i].getBalance();
        }
        return sum;
    }
    public int getNumberOfWithdrawals() {
        int numberOfWithdrawals = 0;
        for (int i = 0; i < 4; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getNumberOfTransactions(); j++) {
                if (cashMachine.getValues()[j] < 0) {
                    numberOfWithdrawals++;
                }
            }
        }
        return numberOfWithdrawals;
    }
    public int getNumberOfDeposits() {
        int numberOfDeposits = 0;
        for (int i = 0; i < 4; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getNumberOfTransactions(); j++) {
                if (cashMachine.getValues()[j] > 0) {
                    numberOfDeposits++;
                }
            }
        }
        return numberOfDeposits;
    }
    public double getAverageOfWithdrawals() {
        int sum = 0;
        int numberOfWithdrawals = 0;
        for (int i = 0; i < 4; i++) {
            CashMachine cashMachine = cashMachines[i];
            for (int j = 0; j < cashMachine.getNumberOfTransactions(); j++) {
                if (cashMachine.getValues()[j] < 0) {
                    sum = sum + cashMachine.getValues()[j];
                    numberOfWithdrawals++;
                    }
                }
            if (numberOfWithdrawals == 0) {
                return 0;
            }
            }
        return sum / numberOfWithdrawals;
    }
        public double getAverageOfDeposits() {
            int sum = 0;
            int numberOfDeposits = 0;
            for (int i = 0; i < 4; i++) {
                CashMachine cashMachine = cashMachines[i];
                for (int j = 0; j < cashMachine.getNumberOfTransactions(); j++) {
                    if (cashMachine.getValues()[j] > 0) {
                        sum = sum + cashMachine.getValues()[j];
                        numberOfDeposits++;
                    }
                }
                if(numberOfDeposits == 0) {return 0;}
            }
            return sum / numberOfDeposits;
        }
    }