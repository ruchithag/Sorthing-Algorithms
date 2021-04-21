package com.ruchithag.a1;

import java.util.Arrays;

public class SorterApp  {

	public static void main(String args[]) {

		int unsortedArrayList[] = { 73, 92, 45, 26, 33, 10, 29, 15 };
		int input = 0;
		System.out.println("Unsorted array list is: ");
		System.out.println(Arrays.toString(unsortedArrayList));

		SorterFactory factory = new SorterFactory();

		Sorter sorter = factory.getSorter("BubbleSort");
		sorter.sort(unsortedArrayList);
		System.out.println("Sorted array list is: ");
		System.out.println(Arrays.toString(unsortedArrayList));
	}
}
