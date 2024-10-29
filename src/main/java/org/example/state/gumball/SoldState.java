package org.example.state.gumball;

public class SoldState implements State {

  private GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("let 🥲 us give you the gumball first");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("no turning back now 😈");
  }

  @Override
  public void turnCrank() {
    System.out.println("you have already turned the crank");
  }

  @Override
  public void dispense() {
    System.out.println("here is your gumball");
    gumballMachine.setCount(gumballMachine.getCount() - 1);
    if (gumballMachine.getCount() == 0) {
      System.out.println("sold out, no gumballs left 🥲");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      System.out.println("ready for next customer 🤓, please enter a coin");
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
  }
}
