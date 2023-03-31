package org.example;

public class Transaction {

  private final int amount;

  public Transaction(int amount) {
    this.amount = amount;
  }

  public boolean hasAmount(int amount) {
    return this.amount == amount;
  }
}
