package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void returnFalseIfHasDifferentAmount() {
        Transaction transaction = new Transaction(0);

        final boolean hasAmount = transaction.hasAmount(1);

        assertFalse(hasAmount);
    }

    @Test
    void returnTrueIfHasSameAmount() {
        Transaction transaction = new Transaction(1);

        final boolean hasAmount = transaction.hasAmount(1);

        assertTrue(hasAmount);
    }

}