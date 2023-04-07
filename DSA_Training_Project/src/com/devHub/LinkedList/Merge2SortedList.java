package com.devHub.LinkedList;

//import com.devHub.LinkedList.SinglyLinkedList;

public class Merge2SortedList {
	
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
	
	public ListNode mergeList(ListNode a, ListNode b) {
		ListNode dummy=new ListNode(0);
		ListNode tail=dummy;
		
		while(a!=null && b!=null) {
			
		}
		return dummy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge2SortedList list=new Merge2SortedList();
		list.head=new ListNode(5);
		ListNode second=new ListNode(9);
		ListNode third=new ListNode(17);
		ListNode fourth=new ListNode(19);
		ListNode fifth=new ListNode(27);
		ListNode sixth=new ListNode(30);
		
		list.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		
		Merge2SortedList list1=new Merge2SortedList();
		list1.head=new ListNode(2);
		ListNode second1=new ListNode(6);
		ListNode third1=new ListNode(8);
		ListNode fourth1=new ListNode(15);
		ListNode fifth1=new ListNode(24);
		ListNode sixth1=new ListNode(33);
		
		list1.head.next=second1;
		second1.next=third1;
		third1.next=fourth1;
		fourth1.next=fifth1;
		fifth1.next=sixth1;
		
		
	}

}
