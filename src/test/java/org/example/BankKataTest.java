package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BankKataTest {

  private MyConsole console;

  private Account account;

  @BeforeEach
  void setUp() {
    console = Mockito.mock(MyConsole.class);
    account = new Account(console);
  }

  @Test
  public void test() {
    account.deposit(1000);
    account.deposit(2000);
    account.withdraw(500);

    account.printStatement();

    Mockito.verify(console).print("DATE | AMOUNT | BALANCE");
    Mockito.verify(console).print("24/01/2012 | 500.00 | 2500.00");
    Mockito.verify(console).print("23/01/2012 | 2000.00 | 3000.00");
    Mockito.verify(console).print("20/01/2012 | 1000.00 | 1000.00");
  }
}
