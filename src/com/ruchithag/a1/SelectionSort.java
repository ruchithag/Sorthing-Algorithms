package com.ruchithag.a1;

public class SelectionSort implements Sorter{
	public int[] sort(int[] inputArr)
	  {
	       for(int i = 0;i<inputArr.length-1;i++)//to find the smallest element starting from position i
	       {
	           int min=i;// record the position of the smallest
	           for(int j=i+1;j<inputArr.length;j++)
	           {
	               if(inputArr[j]<inputArr[min])//to update minimum  finding a smaller element
	                   min = j;
	           }
	           swap(inputArr,i,min);//to swap the smallest element at position i
	       }
	    System.out.println("Array is sorted using Selection Sort Algorithm");
	    return inputArr;
	  }
	  private void swap(int[] inputArr,int k, int l )
	  {
	    int temp = inputArr[k];
	    inputArr[k] = inputArr[l];
	    inputArr[l] = temp;
	  }
	}

