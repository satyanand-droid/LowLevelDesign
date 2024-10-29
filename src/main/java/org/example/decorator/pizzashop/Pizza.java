package org.example.decorator.pizzashop;

public abstract class Pizza {
  String description = "unknown pizza";

  String getDescription() {
    return description;
  }

  public abstract double getCost();
}
