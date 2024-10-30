package org.example.state.vendingmachine;

import java.util.List;

public class SoldState implements State {
  private VendingMachine vendingMachine;

  public SoldState(VendingMachine vendingMachine) {
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
    System.out.println("dispensing item");
    List<List<String>> inventory = vendingMachine.getInventory();
    String item = "";
    for (int i = 0; i < inventory.size(); i++) {
      for (int j = 0; j < inventory.get(i).size(); j++) {
        String currentItem = inventory.get(i).get(j);
        if (currentItem.length() > 0) {
          item = currentItem;
          break;
        }
      }
    }
    if (item.length() == 0) {
      System.out.println("we have ran out of items");
      vendingMachine.setCurrentState(vendingMachine.getSoldOutState());
    } else {
      System.out.println("ready for next customer");
      vendingMachine.setCurrentState(vendingMachine.getNoCoinState());
    }
  }
}
