package com.devHub.javapractice;

public class Pattern {
	
	public void pattern1() {
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		
		char ch='*';
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	public void pattern2() {
		char ch='*';
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
	
	public void pattern3() {
		
		/*
		 
		    *
		   ***
		  *****
		 *******
		*********
		 
		*/
		char ch='*';
		for(int i=0;i<5;i++) {
			for(int j=5-i;j>1;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<(2*i)+1;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
//		Pattern p1=new Pattern();
//		p1.pattern1();
//		Pattern p2=new Pattern();
//		p2.pattern2();
		Pattern p3=new Pattern();
		p3.pattern3();

	}

}
