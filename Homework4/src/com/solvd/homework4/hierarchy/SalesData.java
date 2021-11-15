package com.solvd.homework4.hierarchy;

public final class SalesData {
    public final static int MY_PC_PRICE = 700;
    public final static int MY_PC2_PRICE = 600;
    public final static int MY_LT_PRICE = 800;
    public final static int MY_LT2_PRICE = 800;

    public static void pricelist(int MY_PC_PRICE, int MY_PC2_PRICE, int MY_LT_PRICE, int MY_LT2_PRICE){
        System.out.println("Desktop 1 price: " + MY_PC_PRICE);
        System.out.println("Desktop 2 price: " + MY_PC2_PRICE);
        System.out.println("Laptop 1 price: " + MY_LT_PRICE);
        System.out.println("Laptop 2 price: " + MY_LT2_PRICE);
    }
}
