package org.example.state.gumball;

public class HasQuarterState implements State {

  private GumballMachine gumballMachine;

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("coin is already there");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("customer has asked for his money back, he does not want a gumball");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("customer has turned the crank");
    gumballMachine.setState(gumballMachine.getSoldState());
  }

  @Override
  public void dispense() {
    System.out.println("please turn the crank first");
  }
}
