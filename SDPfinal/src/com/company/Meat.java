package com.company;

public class Meat implements Product{
    private static Meat Instance;
    private final int price;
    private final String Name;

    public static Meat getInstance(){
        if (Instance == null){
            Instance = new Meat(3000, "Beef");
        }

        return Instance;
    }

    private Meat(int price, String name) {
        this.price = price;
        Name = name;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
