package com.solvd.homework4.hierarchy;

import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;

public final class SalesData {
    private final static Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());
    public final static int MY_PC_PRICE = 700;
    public final static int MY_PC2_PRICE = 600;
    public final static int MY_LT_PRICE = 800;
    public final static int MY_LT2_PRICE = 800;

    public static void pricelist(int MY_PC_PRICE, int MY_PC2_PRICE, int MY_LT_PRICE, int MY_LT2_PRICE){
        LOGGER.info("Desktop 1 price: " + MY_PC_PRICE);
        LOGGER.info("Desktop 2 price: " + MY_PC2_PRICE);
        LOGGER.info("Laptop 1 price: " + MY_LT_PRICE);
        LOGGER.info("Laptop 2 price: " + MY_LT2_PRICE);
    }
}
