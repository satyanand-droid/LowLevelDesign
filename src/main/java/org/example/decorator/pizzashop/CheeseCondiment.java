package org.example.decorator.pizzashop;

public class CheeseCondiment extends PizzaCondiment {
  private Pizza pizza;

  public CheeseCondiment(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public double getCost() {
    return pizza.getCost() + 50.00;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + " added cheese";
  }
}
