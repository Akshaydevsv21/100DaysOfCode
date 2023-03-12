package com.devHub.Arrays;

public class RemoveEvenInteger {
	
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int[] removeEvenVal(int[] arr) {
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)!=0) {
				oddCount++;
			}
		}
		int result[]=new int[oddCount];
		int idx=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2!=0) {
				result[idx]=arr[j];
				idx++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,7,5,2,9,1,73,86};
		RemoveEvenInteger rm=new RemoveEvenInteger();
		rm.printArray(arr);
		
		int res[]=rm.removeEvenVal(arr);
		rm.printArray(res);
		
		
	}

}
