/* Program to Implement SinglyLinkedList Elements creation and Display logic
 *  Dated - 12 February 2024
* Author - Akshay Dev S V   */ 

package com.devHub.LinkedList;

public class SLL {
	
	private ListNode head;
	
	public static class ListNode {
		int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void display() {
		int len=0;
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
			len++;
		}
		System.out.print("null");
		System.out.println();
		System.out.println("Length of the Singly Linked List: "+len);
	}

	public static void main(String[] args) {
		
		SLL sl=new SLL();
		
		sl.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		ListNode fifth=new ListNode(50);
		
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		
		sl.display();

	}

}
