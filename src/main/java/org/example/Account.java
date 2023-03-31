package org.example;

import java.util.List;

public class Account {

  private TransactionRepository transactionRepository;

  private StatementPrinter statementPrinter;

  public Account(MyConsole console) {
    this.transactionRepository = new TransactionRepository();
  }

  public void deposit(int amount) {
    this.transactionRepository.deposit(amount);
  }

  public void withdraw(int amount) {
    this.transactionRepository.withdraw(amount);
  }

  public void printStatement() {
    List<Transaction> allTransactions = this.transactionRepository.allTransactions();
    this.statementPrinter.print(allTransactions);
  }
}
