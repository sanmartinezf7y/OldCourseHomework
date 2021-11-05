package com.solvd.homework2.task3;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Random random= new Random();
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);

        String string1 = new String(bytes);
        System.out.println(bytes);
    }
}
