package org.example;

import java.util.List;

public class TransactionRepository {

  public void deposit(int amount) {
    //TODO
  }

  public void withdraw(int amount) {
    throw new RuntimeException("Not implemented yet");
  }

  public List<Transaction> allTransactions() {
    return List.of(new Transaction(0));
  }
}
