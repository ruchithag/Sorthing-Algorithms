package com.ruchithag.a1;

public class BubbleSort implements Sorter{

		 public int[] sort(int[] unsortedArrayList) {
		    int n = unsortedArrayList.length;
		    for(int i = 0; i < n; i++ ) {
		      for(int j = 1; j < (n - i); j++) {
		        if(unsortedArrayList[j - 1] > unsortedArrayList[j]) {
		          swap(j - 1, j,unsortedArrayList);
		        }
		      }
		    }
		    System.out.println("Array is sorted using Bubble Sort Algorithm");
		    return unsortedArrayList;
		  }
		  private void swap( int k, int l, int[] unsortedArrayList) {
		    int temp = unsortedArrayList[k];
		    unsortedArrayList[k] = unsortedArrayList[l];
		    unsortedArrayList[l] = temp;
	}

}
