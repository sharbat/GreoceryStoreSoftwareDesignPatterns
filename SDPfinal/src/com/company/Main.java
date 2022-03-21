package com.company;

import java.util.Scanner;

public class Main{
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        Shop_Inventory inventory = new Shop_Inventory();

        //adding regular store products - ones that implement Product interface
        Meat meat = Meat.getInstance();
        inventory.addProduct(meat);
        FishProducts Fish = FishProducts.getInstance();
        inventory.addProduct(Fish);
        //adding GroceryItem to the store using an adapter
        Product meatDecorator1=MeatDecorator.getInstance();

        GroceryItem groceryItem = new GroceryItem("Wheat Flour", 100);
        inventory.addProduct(new GroceryItemAdapter(groceryItem));
        System.out.println("New added products are "+ inventory.products.get(0).getName()+" "+inventory.products.get(0).getPrice());
        System.out.println("New added products are "+ inventory.products.get(1).getName()+" "+inventory.products.get(1).getPrice());
        System.out.println("New added Grocery Items are "+ groceryItem.getItemName()+groceryItem.getCostPerUnit());
        System.out.println("Price after the discount "+meatDecorator1.getPrice());
        
        Client client1 = new Client(10000, "Kazakhstan");
        client1.addProduct(meatDecorator1);
        client1.addProduct(inventory.products.get(0));
        client1.addProduct(inventory.products.get(1));
        client1.orderCart();
        System.out.println(client1.getBalance());

    }

}
