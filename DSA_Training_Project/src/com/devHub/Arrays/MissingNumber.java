/* Program to find Missing Number in an Array with range 1 to n
* Dated - 17 March 2023
* Author - Akshay Dev S V */ 

package com.devHub.Arrays;

public class MissingNumber {
	
	public static int findMissingNumber(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int num:arr) {
			sum=sum-num;
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr=new int[] {1,4,6,7,3,2,5,9};
		System.out.println("Missing Number in Array:- "+findMissingNumber(arr));

	}

}

 

/*  Output
 *----------------------------
 * Missing Number in Array:- 8
 */