package com.company;

import java.util.*;

public class OrderByCash extends OrderTemplate{

    Scanner sc= new Scanner(System.in);
    @Override
    void setAddress() {
        System.out.println("Set your address");
        setAddress(sc.nextLine());
    }

    @Override
    void setDelivery() {
        System.out.println("Choose delivery type: ");
        System.out.println("Normal $5");
        System.out.println("Fast $15");
        setDelivery(sc.nextInt());
    }

    @Override
    void setPayment() {
        System.out.println("You are paying by cash");
    }
}
