package org.example.state.gumball;

public class Main {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);
    gumballMachine.turnCrank();
    gumballMachine.ejectCoin();
    gumballMachine.insertCoin();
    gumballMachine.turnCrank();
    gumballMachine.turnCrank();
    gumballMachine.insertCoin();
    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();
  }
}
