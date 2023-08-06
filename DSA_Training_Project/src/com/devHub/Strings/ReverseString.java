/* Program to Reverse a String 
 *  Author - Akshay Dev S V
 *  Date- 6th August 2023
 * */

package com.devHub.Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be Reversed: ");
		String input=sc.nextLine();
		
		System.out.println("The Reversed String is: "+reverse(input));
		
	}

	private static String reverse(String input) {
		String out="";
		for(int i=input.length()-1;i>=0;i--) {
			out+=input.charAt(i);
		}
		return out;
	}

}

/*   Output
 * -----------
 * Enter the String to be Reversed: 
 * Akshay
 * The Reversed String is: yahskA
 * */
