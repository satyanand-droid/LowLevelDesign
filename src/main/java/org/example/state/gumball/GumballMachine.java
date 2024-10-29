package org.example.state.gumball;

public class GumballMachine {

  private State hasQuarterState;
  private State noQuarterState;
  private State soldOutState;
  private State soldState;

  private State state = soldOutState;
  private int count = 0;

  public GumballMachine(int numberOfGumball) {
    this.hasQuarterState = new HasQuarterState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.soldState = new SoldState(this);
    this.soldOutState = new SoldOutState(this);
    this.count = numberOfGumball;
    if (count > 0) {
      state = noQuarterState;
    }
  }

  public void insertCoin() {
    state.insertQuarter();
  }

  public void ejectCoin() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public void setHasQuarterState(State hasQuarterState) {
    this.hasQuarterState = hasQuarterState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public void setNoQuarterState(State noQuarterState) {
    this.noQuarterState = noQuarterState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public void setSoldOutState(State soldOutState) {
    this.soldOutState = soldOutState;
  }

  public State getSoldState() {
    return soldState;
  }

  public void setSoldState(State soldState) {
    this.soldState = soldState;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
