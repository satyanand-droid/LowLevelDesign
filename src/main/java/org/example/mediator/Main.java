package org.example.mediator;

public class Main {
    public static void main(String[] args){
        Mediator mediator = new AuctionMediator();
        Bidder bidder1=new Bidder("satya", mediator);
        Bidder bidder2= new Bidder("raja", mediator);
        Bidder bidder3= new Bidder("om", mediator);
        bidder1.placeBid(1000);
        bidder2.placeBid(1500);
        mediator.getWinner();

    }
}
