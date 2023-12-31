package org.store.shopping;

import static org.junit.Assert.assertTrue;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShopTest {

    Shop myShop = new Shop();

    /**
     * 
     */
    @Before
    public void setUp() {
        myShop.addItem("Apple", 2.99);
        myShop.addItem("Peach", 1.99);
        myShop.addItem("Apricot", 3.99);
        myShop.addItem("Ginger", 0.99);
    }
    @Test
    public void testGetInventoryItems(){
        String expected ="{[Apple,2.99][Peach,1.99][Apricot,3.99][Ginger,0.99]}";

        String actual = myShop.getInventoryItems();
        System.out.println(actual);
        assertEquals(expected, actual);
    }

   @Test
    public void testGetInventoryNumbers(){

        int n = myShop.getInventoryNumbers();
        System.out.println();
    }

    
}
