package org.example.chainofresponsibility.atmdispenser;

public class Dispenser20 implements DispenseChain {

  DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    int amount = currency.getAmount();
    if (amount >= 20) {
      int notes = amount / 20;
      int remainder = amount % 20;
      System.out.println("dispensing " + notes + " notes of 20");
      if (remainder != 0) {
        this.chain.dispense(new Currency(remainder));
      }
    } else {
      this.chain.dispense(new Currency(amount));
    }
  }
}
