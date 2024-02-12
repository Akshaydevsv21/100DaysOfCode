package com.devHub.Apps;

import java.util.HashMap;
import java.util.Scanner;

public class MCQ_QuizProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		HashMap<String, HashMap<Integer, String>> questionMap= new HashMap<>();
		
		
		
		
		System.out.println("MCQ Quiz Program");
		System.out.println("----------------");
		
		
		System.out.println("A. Which among the following is the Capital of India ?");
		System.out.println("\n1.New Delhi\n2.Chennai\n3.Kochi\n4.Mumbai");
		
		HashMap<Integer, String> answerMap=new HashMap<>();
		answerMap.put(1, "New Delhi");
		answerMap.put(2, "Chennai");
		answerMap.put(3, "Kochi");
		answerMap.put(4, "Mumbai");
		
		questionMap.put("A", answerMap);
		
		System.out.println("\nB. Sum of the Result: 5+7 ?");
		System.out.println("\n1.9\n2.11\n3.12\n4.10");
		
		HashMap<Integer, String> answerMap2=new HashMap<>();
		answerMap2.put(1, "9");
		answerMap2.put(2, "11");
		answerMap2.put(3, "12");
		answerMap2.put(4, "10");
		
		questionMap.put("B", answerMap2);
		
		System.out.println("\nC. Which among the following is the Fastest Animal in World ?");
		System.out.println("\n1.Tiger\n2.Cheetah\n3.Lion\n4.Leopard");
		
		HashMap<Integer, String> answerMap3=new HashMap<>();
		answerMap3.put(1, "Tiger");
		answerMap3.put(2, "Cheetah");
		answerMap3.put(3, "Lion");
		answerMap3.put(4, "Leopard");
		
		questionMap.put("C", answerMap3);

	}

}
