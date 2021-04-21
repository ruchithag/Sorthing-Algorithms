	package com.ruchithag.a1;
	import java.util.Scanner;

public class StrategyUser{
		public static void main(String[] args) {
    	 System.out.println("Enter Sort Algorithm:'BubbleSort'or'InsertionSort'or'SelectionSort'");
		    Scanner scanner = new Scanner(System.in);
		    String sortAlgorithm = scanner.next();
		    System.out.println("Sort Algorithm is: "+sortAlgorithm);
		    SorterContext context = new SorterContext();
		    if("BubbleSort".equalsIgnoreCase(sortAlgorithm)) {
		      context.setSortingStrategy(new BubbleSort());
		    }
		    else if("SelectionSort".equalsIgnoreCase(sortAlgorithm)) {
		      context.setSortingStrategy(new SelectionSort());
		    }
		    else if("InsertionSort".equalsIgnoreCase(sortAlgorithm)) {
		      context.setSortingStrategy(new InsertionSort());
		    }
   context.sort();
		  }
	}
