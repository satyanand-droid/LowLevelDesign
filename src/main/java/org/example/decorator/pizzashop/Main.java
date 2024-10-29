package org.example.decorator.pizzashop;

import org.example.observer.notification.SMSObserver;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new VegPizza();

        // pizza with cheese
        PizzaCondiment pizzaCondiment = new CheeseCondiment(pizza);
        System.out.println(pizzaCondiment.getCost());
        System.out.println(pizzaCondiment.getDescription());

        // customer says to add mushroom

        MushroomCondiment pizzaCondimentMushroom = new MushroomCondiment(pizzaCondiment);
        System.out.println(pizzaCondimentMushroom.getCost());
        System.out.println(pizzaCondimentMushroom.getDescription());
    }
}
