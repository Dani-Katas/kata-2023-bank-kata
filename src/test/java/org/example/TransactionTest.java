package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void returnFalseIfHasDifferentAmount() {
        Transaction transaction = new Transaction(0);
        assertFalse(transaction.hasAmount(1));
    }

    @Test
    void returnTrueIfHasSameAmount() {
        Transaction transaction = new Transaction(1);
        assertTrue(transaction.hasAmount(1));
    }

}