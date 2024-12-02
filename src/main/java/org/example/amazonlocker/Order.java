package org.example.amazonlocker;

import java.util.List;

public class Order {
    private String OrderId;
    private List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }
}
