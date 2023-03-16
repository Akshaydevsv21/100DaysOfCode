/* Program to Resize an Array
* Dated - 16 March 2023
* Author - Akshay Dev S V */ 

package com.devHub.Arrays;

public class ResizeArray {
	
	public int[] resizeArray(int[] arr, int capacity) {
		int[] temp=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp;
		
	}
	public static void main(String[] args) {
		ResizeArray rz=new ResizeArray();
		int[] arr=new int[] {2,4,6,1,9};
		System.out.println("Size of Original Array:-"+arr.length);
		System.out.println("Size of Array After Resize:-"+rz.resizeArray(arr, 7).length);
	}

}
