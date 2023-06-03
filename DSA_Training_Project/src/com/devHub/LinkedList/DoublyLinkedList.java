/* Program to Implement DoublyLinkedList Elements creation and Display logic
 *  Dated - 3 June 2023
* Author - Akshay Dev S V   */ 
package com.devHub.LinkedList;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode previous;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public DoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int length() {
		return length;
	}
	
	public void insertLast(int value) {
		ListNode lt=new ListNode(value);
		if(isEmpty()) {
			head=lt;
		}
		else {
			tail.next=lt;
		}
		lt.previous=tail;
		tail=lt;
		length++;
	}
	
	public void displayForward() {
		if(head==null) {
			return;
		}
		
		ListNode current=head;
		System.out.println("Doubly Linkedlist in Forward direction");
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward() {
		if(tail==null) {
			return;
		}
		
		ListNode current=tail;
		System.out.println("Doubly Linkedlist in Backward direction");
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.previous;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insertLast(1);;
		dll.insertLast(4);
		dll.insertLast(7);
		dll.insertLast(34);
		dll.insertLast(47);
		dll.displayBackward();
		dll.displayForward();
		
	}

}

/*  Output
 *----------------------------
 * Doubly Linkedlist in Backward direction
 * 47-->34-->7-->4-->1-->null
 * Doubly Linkedlist in Forward direction
 * 1-->4-->7-->34-->47-->null
 **/
