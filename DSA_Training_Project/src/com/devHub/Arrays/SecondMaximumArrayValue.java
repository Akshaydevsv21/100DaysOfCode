package com.devHub.Arrays;

public class SecondMaximumArrayValue {
	
	public static int findSecondMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		if(arr==null ||arr.length==0) {
			throw new IllegalArgumentException("Invalid input!");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr= {4,7,5,2,9,86,86,69};
		//int[] arr=null;
		System.out.println("The Second Maximum value in Given Array:-"+findSecondMax(arr));

	}

}
