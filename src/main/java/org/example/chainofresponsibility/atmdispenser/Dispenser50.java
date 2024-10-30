package org.example.chainofresponsibility.atmdispenser;

public class Dispenser50 implements DispenseChain {

  DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    int amount = currency.getAmount();
    if (amount >= 50) {
      int notes = amount / 50;
      int remainder = amount % 50;
      System.out.println("dispensing " + notes + " notes of 50");
      if (remainder != 0) {
        this.chain.dispense(new Currency(remainder));
      }
    } else {
      this.chain.dispense(new Currency(amount));
    }
  }
}
