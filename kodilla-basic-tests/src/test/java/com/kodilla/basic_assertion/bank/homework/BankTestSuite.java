package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void balanceShouldBeZeroIfThereAreNoWithdrawalsNorDeposits() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(0, bank.getBalance());
    }

    @Test
    public void shouldCalculateBalance() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        cashMachines[0].add(300);
        cashMachines[0].add(-100);
        cashMachines[1].add(200);
        cashMachines[3].add(-150);
        cashMachines[3].add(-50);

        assertEquals(200, bank.getBalance());
    }
    @Test
    public void shouldGetNumberOfWithdrawals() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        cashMachines[0].add(300);
        cashMachines[0].add(-100);
        cashMachines[1].add(200);
        cashMachines[3].add(-150);
        cashMachines[3].add(-50);

        assertEquals(3, bank.getNumberOfWithdrawals());
    }
    @Test
    public void shouldGetNumberOfDeposits() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        cashMachines[0].add(300);
        cashMachines[0].add(-100);
        cashMachines[1].add(200);
        cashMachines[3].add(-150);
        cashMachines[3].add(-50);

        assertEquals(2, bank.getNumberOfDeposits());
    }
    @Test
    public void numberOfWithdrawalsShouldBeZeroIfThereAreNoWithdrawals() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        cashMachines[0].add(300);
        cashMachines[1].add(200);

        assertEquals(0, bank.getNumberOfWithdrawals());
    }

    @Test
    public void numberOfDepositsShouldBeZeroIfThereAreNoDeposits() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        cashMachines[0].add(-100);
        cashMachines[3].add(-150);
        cashMachines[3].add(-50);

        assertEquals(0, bank.getNumberOfDeposits());
    }

    @Test
    public void averageOfWithdrawalsShouldBeZeroIfThereAreNoWithdrawals() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        cashMachines[0].add(300);
        cashMachines[1].add(200);

        assertEquals(0, bank.getAverageOfWithdrawals());
    }

    @Test
    public void shouldGetAverageOfWithdrawals() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        cashMachines[0].add(300);
        cashMachines[0].add(-100);
        cashMachines[1].add(200);
        cashMachines[3].add(-150);
        cashMachines[3].add(-50);

        assertEquals(-100, bank.getAverageOfWithdrawals(), 0.01);
    }
    @Test
    public void shouldGetAverageOfDeposits() {
        Bank bank = new Bank();
        CashMachine[] cashMachines = bank.getCashMachines();
        cashMachines[0].add(300);
        cashMachines[0].add(-100);
        cashMachines[1].add(200);
        cashMachines[3].add(-150);
        cashMachines[3].add(-50);

        assertEquals(250, bank.getAverageOfDeposits(), 0.01);
    }
}
