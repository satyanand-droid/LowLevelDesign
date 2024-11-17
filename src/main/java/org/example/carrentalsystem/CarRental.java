package org.example.carrentalsystem;

import java.util.List;

public class CarRental {
    List<Store> stores;
    List<User> users;



    void addStore(Store store){
        stores.add(store);
    }

    void addUser(User user){
        users.add(user);
    }
}
