/* Program to check if a String is a Palindrome 
 *  Author - Akshay Dev S V
 *  Date- 7th August 2023
 * */


package com.devHub.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input String for Palindrome Verification: ");
		String str=sc.nextLine();
		
		boolean isPalindrome=PalindromeChecker(str);
		if(isPalindrome) {
			System.out.println("The String "+str+" is a Palindrome");
		}
		else {
			System.out.println("The String "+str+" is NOT a Palindrome");
		}
		

	}

	private static boolean PalindromeChecker(String str) {
		str=str.toLowerCase();
		Stack<Character> st=new Stack();
		for(char ch: str.toCharArray()) {
			st.push(ch);
		}
		
		for(char ch:str.toCharArray()) {
			if(ch != st.pop()){
				return false;
			}
		}
		return true;
		
	}
	
}

/*   Output
 * -----------
 * Enter the Input String for Palindrome Verification: 
 * Car
 * The String Car is NOT a Palindrome

 * Enter the Input String for Palindrome Verification: 
 * Malayalam
 * The String Malayalam is a Palindrome
 * */
