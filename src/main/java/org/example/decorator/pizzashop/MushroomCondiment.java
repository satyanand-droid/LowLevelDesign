package org.example.decorator.pizzashop;

public class MushroomCondiment extends PizzaCondiment {

  private Pizza pizza;

  public MushroomCondiment(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public double getCost() {
    return pizza.getCost() + 100.50;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + " added mushroom";
  }
}
