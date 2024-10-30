package org.example.state.gumball;

import java.util.Random;

public class HasQuarterState implements State {

  Random randomWinner = new Random(System.currentTimeMillis());
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
    int winner = randomWinner.nextInt(10);
    System.out.println("customer has turned the crank");
    if ((winner == 0) && (gumballMachine.getCount() > 1)) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }

  @Override
  public void dispense() {
    System.out.println("please turn the crank first");
  }
}
