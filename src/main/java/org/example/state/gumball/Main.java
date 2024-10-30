package org.example.state.gumball;

public class Main {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);
    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    // customer tries to cheat
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    // all gumballs are dispensed
    gumballMachine.insertCoin();
  }
}
