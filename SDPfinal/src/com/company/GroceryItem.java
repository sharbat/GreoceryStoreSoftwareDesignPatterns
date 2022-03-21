package com.company;

public class GroceryItem {
    String itemName;
    int costPerUnit;
    //constructor, getters and setters

    public GroceryItem(String itemName, int costPerUnit) {
        this.itemName = itemName;
        this.costPerUnit = costPerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(int costPerUnit) {
        this.costPerUnit = costPerUnit;
    }
}
