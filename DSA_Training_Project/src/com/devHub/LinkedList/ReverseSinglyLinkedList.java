package com.devHub.LinkedList;

public class ReverseSinglyLinkedList {
	
	private ListNode head;
	
	public static class ListNode
	{
		private int data;
		ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public ListNode ReverseSLL(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;	
		}
		while(previous!=null) {
			System.out.print(previous.data+"-->");
			previous=previous.next;
		}
		System.out.println("null");
		return previous;
	}

	public static void main(String[] args) {
		
		ReverseSinglyLinkedList rl=new ReverseSinglyLinkedList();
		rl.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		
		rl.head.next=second;
		second.next=third;
		third.next=fourth;
		
		rl.display();
		rl.ReverseSLL(rl.head);
	}

}
