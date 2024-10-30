package org.example.chainofresponsibility.atmdispenser;

public class Dispenser10 implements DispenseChain {
  DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    int amount = currency.getAmount();
    if (amount >= 10) {
      int notes = amount / 10;
      int remainder = amount % 10;
      System.out.println("dispensing " + notes + " notes of 10");
      if (remainder != 0) {
        this.chain.dispense(new Currency(remainder));
      }
    } else {
      this.chain.dispense(new Currency(amount));
    }
  }
}
