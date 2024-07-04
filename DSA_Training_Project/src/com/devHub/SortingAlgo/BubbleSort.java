/* Program to Implement BubbleSort in an Array
 *  Dated - 4 July 2024
* Author - Akshay Dev S V   */ 

package com.devHub.SortingAlgo;

public class BubbleSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,4,3,2,1};
		arr=swap(arr);
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

	private static int[] swap(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
