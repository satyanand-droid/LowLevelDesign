package org.example.chainofresponsibility.atmdispenser;

public class Currency {
  private int amount;

  public Currency(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }
}
