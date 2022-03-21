package com.company;

public class GroceryItemAdapter implements Product{
    private GroceryItem groceryItem;
    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }
    public String getName() {
        return groceryItem.getItemName();
    }
    public double getPrice() {
        return groceryItem.getCostPerUnit();
    }
}
