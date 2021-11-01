package com.solvd.homework1;

import java.util.Arrays;

public class Task3 {
	
	public static void main (String[] args) {

		int[] ns= {3, 7, 6, 13, 33, 9, -100, 25};
		
		for (int i=0; i < ns.length-1 ; i++) {
			int min = i;
			for (int j = i+1; j < ns.length; j++) {
				
				if (ns[j]<ns[min]) {
					min=j;
				}	
			}
			int temp = ns[min];
			ns[min]= ns[i];
			ns[i]=temp;
		}
      System.out.println(Arrays.toString(ns));
	}
}