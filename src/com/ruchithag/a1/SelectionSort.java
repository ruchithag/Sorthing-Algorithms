package com.ruchithag.a1;

public class SelectionSort implements Sorter{
	public int[] sort(int[] unsortedArrayList)
	  {
	       for(int i = 0;i<unsortedArrayList.length-1;i++)//to find the smallest element starting from position i
	       {
	           int min=i;// record the position of the smallest
	           for(int j=i+1;j<unsortedArrayList.length;j++)
	           {
	               if(unsortedArrayList[j]<unsortedArrayList[min])//to update minimum  finding a smaller element
	                   min = j;
	           }
	           swap(unsortedArrayList,i,min);//to swap the smallest element at position i
	       }
	    System.out.println("Array is sorted using Selection Sort Algorithm");
	    return unsortedArrayList;
	  }
	  private void swap(int[] unsortedArrayList,int k, int l )
	  {
	    int temp = unsortedArrayList[k];
	    unsortedArrayList[k] = unsortedArrayList[l];
	    unsortedArrayList[l] = temp;
	  }
	}

