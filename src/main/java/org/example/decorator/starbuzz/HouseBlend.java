package org.example.decorator.starbuzz;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "house blend ";
  }

  @Override
  public double getCost() {
    return .89;
  }
}
