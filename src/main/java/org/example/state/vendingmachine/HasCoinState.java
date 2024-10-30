package org.example.state.vendingmachine;

import java.util.List;

public class HasCoinState implements State {

  private VendingMachine vendingMachine;

  public HasCoinState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertCoin() {
    System.out.println("invalid action");
  }

  @Override
  public void ejectCoin() {
    System.out.println("it's ok if you want your money back");
    vendingMachine.setCurrentState(vendingMachine.getNoCoinState());
  }

  @Override
  public void pressButton() {
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
    if (item.length() > 0) {
      System.out.println("user has selected " + item);
      for (int i = 0; i < inventory.size(); i++) {
        for (int j = 0; j < inventory.get(i).size(); j++) {
          String currentItem = inventory.get(i).get(j);
          if (currentItem.length() > 0) {
            inventory.get(i).set(j, "");
            break;
          }
        }
      }
      vendingMachine.setCurrentState(vendingMachine.getSoldState());
    }
  }

  @Override
  public void dispense() {
    System.out.println("invalid action");
  }
}
