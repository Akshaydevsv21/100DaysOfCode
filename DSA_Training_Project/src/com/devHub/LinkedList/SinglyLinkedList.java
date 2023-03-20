/* Program to Implement SinglyLinkedList Elements creation and Display logic
 *  Dated - 20 March 2023
* Author - Akshay Dev S V   */ 

package com.devHub.LinkedList;

public class SinglyLinkedList {
	
	public ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		//parameterized constructor
		public ListNode(int data) {
			this.data=data;
			this.next=next;
		}	
	}
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(5);
		ListNode second=new ListNode(7);
		ListNode third=new ListNode(4);
		ListNode fourth=new ListNode(10);
		ListNode fifth=new ListNode(23);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		//5-->7-->4-->10-->23-->null
		sll.display();
		
		

	}

}


/*  Output
 *----------------------------
 * 5-->7-->4-->10-->23-->null
 */
