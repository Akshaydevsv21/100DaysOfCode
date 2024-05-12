/* Program to learn Java Streams Basics
 *  Dated - 12 May 2024
* Author - Akshay Dev S V   */ 


package com.devHub.javapractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> even=nums.stream().filter(n->n%2==0)
							.collect(Collectors.toList());
		
		even.forEach(System.out::println);

	}

}
