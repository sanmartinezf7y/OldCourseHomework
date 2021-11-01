package com.solvd.homework1;

public class Task2 {

	public static void main (String[] args) {
		
		int[] ns= {3, 7, 6, 13, 33, 9, -100, 25};
		
		int i=0;
		int min=0;
		int max=0;
		
			while (i<8)
			{System.out.println(ns[i]);
				if (min>ns[i]) {
				min=ns[i];
				}
				if (max<ns[i]) {
				max=ns[i];
				}
				i++;
			}
		System.out.println("\nMIN= "+min);
		System.out.println("MAX= "+max);
	}
}


