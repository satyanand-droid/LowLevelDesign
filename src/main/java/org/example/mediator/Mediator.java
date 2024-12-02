package org.example.mediator;

public interface Mediator {
    void placeBid(Colleague colleague, int amount);
    void addBidder(Colleague colleague);
    void getWinner();
}
