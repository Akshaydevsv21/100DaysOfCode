/* Program to explain basic stack features & operations 
 *  Author - Akshay Dev S V
 *  Date- 13th March 2024
 * */

package com.devHub.Stack;

import java.util.Stack;

public class StackBasics {

	public static void main(String[] args) {
		
		Stack<String> stack=new Stack<String>();
		
		//Check if Stack is Empty
		System.out.println("Is Stack Empty: "+stack.isEmpty()+"\n");
		
		System.out.println("Adding elements into Stack\n");
		
		//Push Elements into Stack
		stack.push("The Lost Symbol");
		stack.push("Kite Runner");
		stack.push("Great Expectations");
		stack.push("Midnight's children");
		stack.push("Pride & Prejudice");
		
		System.out.println(stack+"\n");
		
		System.out.println("Is Stack Empty: "+stack.isEmpty()+"\n");
		
		//Pop Elements from Stack
		String pop1=stack.pop();
		System.out.println(pop1+"\n");
		
		//Find the Element in Top of stack
		System.out.println(stack.peek()+"\n");
		
		//Search for an element in the Stack
		System.out.println(stack.search("The Lost Symbol")+"\n");
		
		System.out.println(stack);
		
	}

}
