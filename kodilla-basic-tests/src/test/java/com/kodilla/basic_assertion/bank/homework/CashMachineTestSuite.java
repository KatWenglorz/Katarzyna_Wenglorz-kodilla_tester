package com.kodilla.basic_assertion.bank.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-150);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(200, values[0]);
        assertEquals(-150, values[1]);
    }
    @Test
    public void shouldReturnBalanceEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getBalance());
    }
    @Test
    public void shouldReturnNumberOfTransactionsEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getNumberOfTransactions() );
    }
}
