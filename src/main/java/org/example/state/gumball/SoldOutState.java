package org.example.state.gumball;

public class SoldOutState implements State {

  private GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("no gumballs left");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("no gumballs left");
  }

  @Override
  public void turnCrank() {
    System.out.println("no gumballs left");
  }

  @Override
  public void dispense() {
    System.out.println("no gumballs left");
  }
}
