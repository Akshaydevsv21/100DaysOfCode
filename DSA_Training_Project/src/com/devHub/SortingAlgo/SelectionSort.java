/* Program to Implement SelectionSort in an Array
 *  Dated - 5 July 2024
* Author - Akshay Dev S V   */ 


package com.devHub.SortingAlgo;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr= {5,4,1,3,2,9,6};
		
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			arr=swap(arr,i,min);
		}
		
		int i=0;
		System.out.print("[");
		while(i<arr.length) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(",");
			}
			i++;
		}
		System.out.print("]");
	}

	private static int[] swap(int[] arr,int i,int min) {
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		
		return arr;
	}

}
