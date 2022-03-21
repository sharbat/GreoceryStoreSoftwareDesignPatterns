package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Client {
    public static Scanner sc= new Scanner(System.in);
    private static double balance;
    private static String country;
    private static List<Product> Cart = new ArrayList<Product>();
    
    public Client(double balance, String country) {
        Client.balance = balance;
        Client.country = country;
    }

    public static String getCountry() {
        return country;
    }

    public static double getBalance() { return balance; }

    public static void setBalance(double balance) {
        Client.balance = balance;
    }

    public static void setCountry(String country) {
        Client.country = country;
    }

    public void addProduct(Product product) {
        this.Cart.add(product);
    }

    public void orderCart(){
        double total = 0;
        for(Product product: Cart){
            total = total + product.getPrice();
        }
        int option;
        System.out.println("Your payment is " + total);
        System.out.println("How do you want to pay?");
        System.out.println("1. Pay by card");
        System.out.println("2. Pay by cash");
        System.out.println("3. Pick up by yourself");
        option = sc.nextInt();
        OrderTemplate order;
        if (option == 1){
            order = new OrderByCard();
        } else if (option == 2){
            order = new OrderByCash();
        } else {
            order = new OrderPickUp();
        }
        if (order.Order(total, this) ){
            System.out.println("You ordered your products");
        }
    }
}
