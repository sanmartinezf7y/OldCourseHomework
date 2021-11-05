package com.solvd.homework1;

import java.util.Arrays;

public class Task3 {

	public static void main (String[] args) {
		int[] array= {3, 7, 6, 13, 33, 9, -100, 25};
		System.out.println(Arrays.toString(selectionSort(array, 0)));
	}

	static int[] selectionSort(int[] array, int i){
		int min = i;
		for (int search = i + 1; search< array.length; search++) {
			if (array[search] < array[min]){
				min = search;
			}
		}
		int temp = array[min];
		array[min] = array[i];
		array[i] = temp;
		i++;
		if (i + 1 < array.length) {
			selectionSort(array, i);
		}
		return array;
	}
}



//		for (int i=0; i < array.length-1 ; i++) {
//			int min = i;
//			for (int j = i+1; j < array.length; j++) {
//
//				if (array[j]<array[min]) {
//					min=j;
//				}
//			}
//			int temp = array[min];
//			array[min]= array[i];
//			array[i]=temp;