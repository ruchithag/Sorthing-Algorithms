package com.ruchithag.a1;

public class BubbleSort implements Sorter{

		 public int[] sort(int[] inputArr) {
		    int n = inputArr.length;
		    for(int i = 0; i < n; i++ ) {
		      for(int j = 1; j < (n - i); j++) {
		        if(inputArr[j - 1]>inputArr[j]) {
		          swap(j - 1, j,inputArr);
		        }
		      }
		    }
		    System.out.println("Array is sorted using Bubble Sort Algorithm");
		    return inputArr;
		  }
		  private void swap( int k, int l, int[] inputArr ) {
		    int temp = inputArr[k];
		    inputArr[k] = inputArr[l];
		    inputArr[l] = temp;

	}

}
