package com.solvd.homework3.hierarchy;

public final class SalesData {
    public final static int myPCprice = 700;
    public final static int myPC2price = 600;
    public final static int myLTprice = 800;
    public final static int myLT2price = 800;

    public static void pricelist(int myPCprice, int myPC2price, int myLTprice, int myLT2price){
        System.out.println("Desktop 1 price: " + myPCprice);
        System.out.println("Desktop 2 price: " + myPC2price);
        System.out.println("Laptop 1 price: " + myLTprice);
        System.out.println("Laptop 2 price: " + myLT2price);
    }
}

//