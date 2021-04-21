package com.ruchithag.a1;

public class SorterFactory {

	public Sorter getSorter(String algorithm) {
		System.out.println("Sort Algorithm is: " + algorithm);
		
		if (algorithm.equals("BubbleSort"))
			return new BubbleSort();
		else if (algorithm.equals("InsertionSort"))
			return new InsertionSort();
		else
			return new SelectionSort();
	}
}
