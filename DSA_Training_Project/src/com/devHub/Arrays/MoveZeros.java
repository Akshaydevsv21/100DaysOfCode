package com.devHub.Arrays;
import com.devHub.Arrays.ReverseArray;
public class MoveZeros {
	
	
	public int[] moveZero(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			if(arr[j]!=0) {
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {4,7,0,5,2,0,9,73,0,86};
		MoveZeros mz=new MoveZeros();
		System.out.println("Initial Array State:-");
		ReverseArray.printArray(arr);
		mz.moveZero(arr);
		System.out.println("After Moving Zeroes to End Array State:-");
		ReverseArray.printArray(arr);
;
	}

}
