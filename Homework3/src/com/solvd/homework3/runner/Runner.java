package com.solvd.homework3.runner;

import com.solvd.homework3.hierarchy.Desktop;
import com.solvd.homework3.hierarchy.Laptop;

public class Runner {
    public static void main(String[] args) {
        Desktop myPC = new Desktop("i3 9100f", 16, 1024, 3, "Black", false, "GTX 1660s");
        Desktop myPC2 = new Desktop("i5 9400f", 8, 512, 2, "White", false, "GT 1030");

        Laptop myLT = new Laptop("i7 8700k", 16, 512, "QWERTY SPA 100%", true, 12, 5000);
        Laptop myLT2 = new Laptop("i7 8700k", 16, 512, "QWERTY SPA 100%", true, 12, 5000);

        System.out.println(myPC.toString());
        System.out.println("hash= " + myPC.hashCode());

        System.out.println(myPC2.toString());
        System.out.println("hash= " + myPC2.hashCode());

        if(myPC.equals(myPC2)){
            System.out.println("These computers share the same components");
        } else{
            System.out.println("These computers do not share the same components");
        }
        System.out.println("");
        System.out.println(myLT.toString());
        System.out.println("hash= " + myLT.hashCode());

        System.out.println(myLT2.toString());
        System.out.println("hash= " + myLT2.hashCode());

        if(myLT.equals(myLT2)){
            System.out.println("These computers share the same components");
        } else{
            System.out.println("These computers do not share the same components");
        }
    }
}
