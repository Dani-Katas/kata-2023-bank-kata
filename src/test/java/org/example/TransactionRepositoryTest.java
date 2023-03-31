package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TransactionRepositoryTest {

  private TransactionRepository transactionRepository;

  @BeforeEach
  void setUp() {
    transactionRepository = new TransactionRepository();
  }

  @Test
  public void shouldAddTransaction() {
    transactionRepository.deposit(1000);

    List<Transaction> transactions = transactionRepository.allTransactions();

    assertEquals(1, transactions.size());
  }
}
