package com.ruchithag.a1;

public class InsertionSort implements Sorter{

	  public int[] sort(int[] unsortedArrayList) {
	    for(int i=1;i<unsortedArrayList.length;i++) {
	      int temp=unsortedArrayList[i];//temporary copy of an array
	      int j;
	      for(j=i;j>0;j--)//to find the position for insertion
	      {
	        if(unsortedArrayList[j-1]<temp)
	          break;
	        unsortedArrayList[j]=unsortedArrayList[j-1];
	      }
	      unsortedArrayList[j]=temp; //inserting the current element
	    }
	    System.out.println("Array is sorted using Insertion Sort Algorithm:");
	    return unsortedArrayList;
	  }
}
