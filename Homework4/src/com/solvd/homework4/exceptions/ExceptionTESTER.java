package com.solvd.homework4.exceptions;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionTESTER {
    private final static Logger LOGGER = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());

    public static void main(String[] args) throws Exception {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = scanner1.nextInt();
        if(age<18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        LOGGER.info("Access granted - you are old enough");


    }
}
