package com.devHub.Arrays;

import java.util.Arrays;

public class MinArrayValue {
	
	public int findMinValue(int[] arr) {  //Approach 1 using normal iteration
		int min=0;
		if(arr==null ||arr.length==0) {
			throw new IllegalArgumentException("Invalid input!");
		}
		
		min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		return min;
	}
	
	public int findMinValuebySort(int[] arr) {  //Approach 2 using Arrays.sort()
		if(arr==null ||arr.length==0) {
			throw new IllegalArgumentException("Invalid input!");
		}
		int min=0;
		Arrays.sort(arr);
		min=arr[0];
		return min;
	}
	public static void main(String[] args) {
		int[] arr= {4,7,5,2,9,73,86};
		//int[] arr= null;
		MinArrayValue mn=new MinArrayValue();
		System.out.print("Min Value found using normal iteration method:-  "+mn.findMinValue(arr)+"\n"); 
		System.out.print("Min Value found using Arrays.sort():-  "+mn.findMinValuebySort(arr));
	}

}
