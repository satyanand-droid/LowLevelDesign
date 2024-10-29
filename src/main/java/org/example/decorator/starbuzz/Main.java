package org.example.decorator.starbuzz;

public class Main {
  public static void main(String[] args) {
    // house blend with mocha
    // wrapping mocha over house blend
    Beverage beverage = new HouseBlend();
    CondimentDecorator condimentDecorator = new MochaDecorator(beverage);
    System.out.println(condimentDecorator.getCost());
    System.out.println(condimentDecorator.getDescription());

    // house blend with double mocha
    // wrapping mocha(mocha(house blend)))
    CondimentDecorator condimentDecoratorDouble = new MochaDecorator(condimentDecorator);
    System.out.println(condimentDecoratorDouble.getCost());
    System.out.println(condimentDecoratorDouble.getDescription());
  }
}
