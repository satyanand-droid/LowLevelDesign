package org.example.mediator;

public class Bidder implements Colleague {

    String name;
    private Mediator mediator;

    public Bidder(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.addBidder(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void placeBid(int amount) {
        mediator.placeBid(this,amount);
    }

    @Override
    public void receiveBid(int amount) {
        System.out.println("received bid of "+amount + " for "+ name);
    }
}
