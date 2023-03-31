package org.example;

public class Transaction {


  private final int amount;


  public Transaction(int i) {
    this.amount=i;
  }

  public boolean hasAmount(int i) {
    return amount==i;
  }
}
