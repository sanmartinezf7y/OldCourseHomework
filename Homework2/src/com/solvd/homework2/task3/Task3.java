package com.solvd.homework2.task3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    @Override
    public String toString() {
        return "Task3{}";
    }

    public static void main(String[] args) {
        String str = randomStringGenerator();
        String str2 = randomStringGenerator();
        System.out.println("Random String 1: " + str);
        System.out.println("Random String 2: " + str2);

        System.out.println("Length: " + str.length());

        System.out.println("String 1, first char: " + str.charAt(0));
        System.out.println("String 1 toCharArray: " + Arrays.toString(str.toCharArray()));
        System.out.println("String 1 subSequence: " + str.subSequence(3,7));

        System.out.println();

        System.out.println("Strings 1 // 2 toUpperCase: " + str.toUpperCase() + " // " + str2.toUpperCase());

        System.out.println();

        System.out.println("String 2, first char: " + str2.charAt(0));
        System.out.println("String 2 toCharArray: " + Arrays.toString(str2.toCharArray()));
        System.out.println("String 2 replace: " + str2.replace('b', 'Q'));

    }

    public static String randomStringGenerator() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
}


