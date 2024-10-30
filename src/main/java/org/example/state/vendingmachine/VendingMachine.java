package org.example.state.vendingmachine;

import java.util.List;

public class VendingMachine {

  private State hasCoinState;
  private State noCoinState;
  private State soldOutState;
  private State soldState;

  private State currentState;
  private List<List<String>> inventory;

  public VendingMachine(List<List<String>> inventory) {
    this.inventory = inventory;
    this.hasCoinState = new HasCoinState(this);
    this.noCoinState = new NoCoinState(this);
    this.soldState = new SoldState(this);
    this.soldOutState = new SoldOutState(this);
    this.currentState = noCoinState;
  }

  public void insertCoin() {
    currentState.insertCoin();
  }

  public void ejectCoin() {
    currentState.ejectCoin();
  }

  public void pressButton() {
    currentState.pressButton();
    currentState.dispense();
  }

  public State getHasCoinState() {
    return hasCoinState;
  }

  public void setHasCoinState(State hasCoinState) {
    this.hasCoinState = hasCoinState;
  }

  public State getNoCoinState() {
    return noCoinState;
  }

  public void setNoCoinState(State noCoinState) {
    this.noCoinState = noCoinState;
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

  public State getCurrentState() {
    return currentState;
  }

  public void setCurrentState(State currentState) {
    this.currentState = currentState;
  }

  public List<List<String>> getInventory() {
    return inventory;
  }

  public void setInventory(List<List<String>> inventory) {
    this.inventory = inventory;
  }
}
