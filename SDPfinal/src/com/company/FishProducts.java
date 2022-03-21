package com.company;

public class FishProducts implements Product{
    private final int price;
    private final String Name;
    private static FishProducts Instance;

    public static FishProducts getInstance(){
        if (Instance == null){
            Instance = new FishProducts(2000, "Togzhan");
        }

        return Instance;
    }

    private FishProducts(int price, String name) {
        this.price = price;
        Name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
