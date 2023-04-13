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
	
	public void displayForward() {
		if(head==null) {
			return;
		}
		
		ListNode current=head;
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
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.previous;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

	}

}
