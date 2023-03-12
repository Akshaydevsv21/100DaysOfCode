package com.devHub.AlgoAnalysis;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double now=System.currentTimeMillis();
		
		TimeComplexity tc=new TimeComplexity();
		tc.findSum(999999);
		System.out.println("Time taken for Execution = "+(System.currentTimeMillis()-now)); 
		
	}
	
//	public int findSum(int n) {
//		return (n*(n+1))/2;
//	}
	
	public int findSum(int n) {
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
