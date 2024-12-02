package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{

    List<Colleague> bidders ;
    Colleague winnerColleague = null;
    int highestBid =0;
    public AuctionMediator() {
       bidders= new ArrayList<>();
    }

    @Override
    public void placeBid(Colleague bidder, int amount) {
    if (amount > highestBid) {
        highestBid = amount;
        winnerColleague= bidder;
      for (Colleague colleague : bidders) {
        if (colleague != bidder) {
          colleague.receiveBid(amount);
        }
      }
        }
    }

    @Override
    public void addBidder(Colleague colleague) {
            bidders.add(colleague);
    }

   public void getWinner(){
        System.out.println("winner is "+ winnerColleague.getName() + " with amount "+ highestBid);
   }
}
