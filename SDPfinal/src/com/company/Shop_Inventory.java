package com.company;

import java.util.ArrayList;
import java.util.List;

public class Shop_Inventory{

    public List<Product> products;
    public Shop_Inventory() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
