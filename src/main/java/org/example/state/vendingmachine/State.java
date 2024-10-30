package org.example.state.vendingmachine;

public interface State {
  public void insertCoin();

  public void ejectCoin();

  public void pressButton();

  public void dispense();
}
