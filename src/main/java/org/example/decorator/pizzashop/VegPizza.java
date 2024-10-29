package org.example.decorator.pizzashop;

public class VegPizza extends Pizza {

  public VegPizza() {
    description = "veg pizza";
  }

  @Override
  public double getCost() {
    return 200.50;
  }
}
