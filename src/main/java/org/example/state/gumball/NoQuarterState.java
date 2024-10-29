package org.example.state.gumball;

public class NoQuarterState implements State {
  private GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("quarter inserted");
    System.out.println("moving to has quarter state");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  @Override
  public void ejectQuarter() {
    System.out.println("no coin is there");
  }

  @Override
  public void turnCrank() {
    System.out.println("insert coin first ");
  }

  @Override
  public void dispense() {
    System.out.println("insert coin first 😠");
  }
}
