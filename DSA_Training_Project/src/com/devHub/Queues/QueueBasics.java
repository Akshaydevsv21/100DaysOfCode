/* Program to explain basic Queue features & operations 
 *  Author - Akshay Dev S V
 *  Date- 14th March 2024
 * */

package com.devHub.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {

	public static void main(String[] args) {

		
		Queue<String> queue=new LinkedList<String>();
		
		//Check if queue is Empty
		System.out.println(queue.isEmpty());
				
		//Add elements into queue
		
		queue.offer("Akshay");
		queue.offer("Anjitha");
		queue.offer("Akhil");
		queue.offer("Amal");
		
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		//Peek into head of Queue
		System.out.println(queue.peek());
		System.out.println("Size of queue: "+queue.size());
		
		//Remove elements from queue
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println("Size of queue after removing all elements: "+queue.size());
		System.out.println(queue);

	}

}
