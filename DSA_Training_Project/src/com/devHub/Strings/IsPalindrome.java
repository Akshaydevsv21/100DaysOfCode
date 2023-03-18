/* Program to check if a given String is a Palindrome
 *  Dated - 18 March 2023
* Author - Akshay Dev S V */ 

package com.devHub.Strings;

public class IsPalindrome {
	
	public boolean isPalindrome(String str) {
		char[] chstring=str.toCharArray();
		int start=0;
		int end=str.length()-1;
		
		while(start<end) {
			if(chstring[start]!=chstring[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str="Malayalam";
		IsPalindrome iP=new IsPalindrome();
		if(iP.isPalindrome(str.toLowerCase())) {
			System.out.println("String "+str+" is a Palindrome");
		}
		else {
			System.out.println("String "+str+" is Not a Palindrome");
		}

	}

}

/*  Output
 *----------------------------
 * String Malayalam is a Palindrome
 */