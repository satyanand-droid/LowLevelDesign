package org.example.state.vendingmachine;

public class NoCoinState implements State {
  private VendingMachine vendingMachine;

  public NoCoinState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("you have inserted the coin");
    vendingMachine.setCurrentState(vendingMachine.getHasCoinState());
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
