package org.store.shopping;

import org.dsa.api.LinkedList;
import java.util.List;

public class Shop {
    LinkedList<Item> inventory = new LinkedList<Item>();

    public void addItem (String name, double d){
        Item item = new Item(name, d);
        inventory.addNode(item);
    }

    public String  getInventoryItems(){
        //fancy formating of the string output
        StringBuffer sb = new StringBuffer("{");
        List<Item> itemList = inventory.getElementObject();
        for (Item item :itemList){
            sb.append("[")
                .append(item.getName())
                .append(",")
                .append(item.getPrice())
                .append("]");
        }
        sb.append("}");

        return sb.toString();

    }

    public int getInventoryNumbers(){
        return inventory.getListLength();
    }

}
