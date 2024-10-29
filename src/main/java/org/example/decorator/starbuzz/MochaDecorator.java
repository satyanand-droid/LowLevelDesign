package org.example.decorator.starbuzz;

public class MochaDecorator extends CondimentDecorator {

  private Beverage beverage;

  public MochaDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + "with mocha";
  }

  @Override
  public double getCost() {
    return beverage.getCost() + .10;
  }
}
