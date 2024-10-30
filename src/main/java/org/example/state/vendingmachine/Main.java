package org.example.state.vendingmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<List<String>> inventory = new ArrayList<>();
    List<String> row1 = Arrays.asList("Cookie", "chocolate", "cold drink");
    List<String> row2 = Arrays.asList("Cookie", "chocolate", "cold drink");
    inventory.add(row1);
    inventory.add(row2);
    VendingMachine vendingMachine = new VendingMachine(inventory);

    //        vendingMachine.ejectCoin();

    vendingMachine.insertCoin();
    vendingMachine.pressButton();

    vendingMachine.insertCoin();
    vendingMachine.pressButton();

    vendingMachine.insertCoin();
    vendingMachine.pressButton();
  }
}
