package com.company;

public class MeatDecorator extends Decorator {
    private static MeatDecorator Instance;

    public static MeatDecorator getInstance(){
        if (Instance == null){
            Meat meat = Meat.getInstance();
            Instance = new MeatDecorator(meat);
        }

        return Instance;
    }

    private MeatDecorator(Product product) {
        super(product);
    }

    @Override
    public String getName() {
        return this.product.getName();
    }

    @Override
    public double getPrice() {
        return this.product.getPrice()-19;
    }
}
