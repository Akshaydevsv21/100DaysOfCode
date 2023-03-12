package com.devHub.Arrays;

public class ReverseArray {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void reverseArray(int[] numArray,int start,int end) {
		while(start<end) {
			int temp=numArray[start];
			numArray[start]=numArray[end];
			numArray[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {4,7,5,2,9,1,73,86};
		printArray(arr);
		reverseArray(arr, 0, arr.length-1);
		System.out.println("The Reversed Array:- ");
		printArray(arr);
	}

}
