package org.store.shopping;

public class Item {
    String name;
    double price;

    Item(String name, double price){
        this.name = name;
        this.price = price;
    }


    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }


    
}
