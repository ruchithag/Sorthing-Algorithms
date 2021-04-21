package com.ruchithag.a1;

public class InsertionSort implements Sorter{

	  public int[] sort(int[] inputArr) {
	    for(int i=1;i<inputArr.length;i++) {
	      int temp=inputArr[i];//temporary copy of an array
	      int j;
	      for(j=i;j>0;j--)//to find the position for insertion
	      {
	        if(inputArr[j-1]<temp)
	          break;
	        inputArr[j]=inputArr[j-1];//sorted part to right
	      }
	      inputArr[j]=temp; //inserting the current element
	    }
	    System.out.println("Array is sorted using Insertion Sort Algorithm:");
	    return inputArr;
	  }
}
