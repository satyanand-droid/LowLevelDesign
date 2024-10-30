package org.example.chainofresponsibility.atmdispenser;

public class Main {
  public static void main(String[] args) {
    Currency currency = new Currency(50);
    DispenseChain dispenseChain50 = new Dispenser50();
    DispenseChain dispenseChain20 = new Dispenser20();
    DispenseChain dispenseChain10 = new Dispenser10();
    dispenseChain50.setNextChain(dispenseChain20);
    dispenseChain20.setNextChain(dispenseChain10);

    dispenseChain50.dispense(currency);
  }
}
