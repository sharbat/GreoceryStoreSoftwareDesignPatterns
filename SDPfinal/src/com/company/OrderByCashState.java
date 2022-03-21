package com.company;

import java.util.*;

public class OrderByCashState implements OrderState{
    private OrderTemplate order;
    public OrderByCashState(OrderTemplate order){
        this.order = order;
    }

    Scanner sc= new Scanner(System.in);

    @Override
    public void changeAddress() {
        System.out.println("Set your address");
        order.setAddress(sc.nextLine());
    }

    @Override
    public void payByCard() {
        System.out.println("You are paying by card");
        System.out.println("Input your card number:");
        order.setCardnumber(sc.nextLine());
        order.setOrderState(order.getOrderByCard());
    }

    @Override
    public void payByCash() {
        System.out.println("You are paying by cash");
        order.setCardnumber(null);
    }

    @Override
    public void setPickup() {
        System.out.println("You chose pickup option");
        order.setDelivery(0);
    }

    @Override
    public void changeDelivery() {
        System.out.println("Choose delivery type: ");
        System.out.println("Normal $5");
        System.out.println("Fast $15");
        order.setDelivery(sc.nextInt());
    }
}
