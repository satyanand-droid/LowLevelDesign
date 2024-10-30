package org.example.state.vendingmachine;

public class SoldOutState implements State {

  private VendingMachine vendingMachine;

  public SoldOutState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("invalid action");
  }

  @Override
  public void ejectCoin() {
    System.out.println("invalid action");
  }

  @Override
  public void pressButton() {
    System.out.println("invalid action");
  }

  @Override
  public void dispense() {
    System.out.println("invalid action");
  }
}
