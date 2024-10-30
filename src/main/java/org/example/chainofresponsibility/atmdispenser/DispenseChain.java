package org.example.chainofresponsibility.atmdispenser;

public interface DispenseChain {

  public void setNextChain(DispenseChain nextChain);

  public void dispense(Currency currency);
}
