package com.devHub.Arrays;

public class ArrayDemo {
	
	public int[] arrayCreate(int n) {
		int[] myArray=new int[n];
		return myArray;
	}
	
	public void printArray(int n) {
		int arr1[]=arrayCreate(n);
		System.out.print("[");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+",");
		}
		//System.out.println(arr1);
		arr1[arr1.length-1]=0;
		System.out.print(arr1[arr1.length-1]+"]");
		//System.out.println(arr1[arr1.length-1]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo arr=new ArrayDemo();
		//arr.arrayCreate(4);
		arr.printArray(4);

	}

}
