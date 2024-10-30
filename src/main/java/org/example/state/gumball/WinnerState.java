package org.example.state.gumball;

public class WinnerState implements State {

  private GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("no need to insert coin");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("too late, can't go back");
  }

  @Override
  public void turnCrank() {
    System.out.println("can't turn the crank again");
  }

  @Override
  public void dispense() {
    System.out.println("must be nice, you get 2 gumballs");
    gumballMachine.setCount(gumballMachine.getCount() - 2);
    if (gumballMachine.getCount() == 0) {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
  }
}
