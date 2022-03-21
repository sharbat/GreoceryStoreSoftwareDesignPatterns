package com.company;

public class OrderPickUp extends OrderTemplate{
    @Override
    void setAddress() {
        System.out.println("You chose pickup option");
    }

    @Override
    void setDelivery() {
        System.out.println("No delivery is available");

    }

    @Override
    void setPayment() {
        System.out.println("You can pay by anything at the store");
    }
}
