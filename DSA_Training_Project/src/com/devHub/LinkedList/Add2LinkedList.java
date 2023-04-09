/* Program to Implement Addition of 2 SinglyLinkedLists
 *  Dated - 9 April 2023
* Author - Akshay Dev S V   */ 

package com.devHub.LinkedList;

public class Add2LinkedList {
	
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
	
	public ListNode add(ListNode a, ListNode b) {
		ListNode dummy=new ListNode(0);
		ListNode tail=dummy;
		
		int carry=0;
		while(a!=null || b!=null) {
			int x=(a!=null)? a.data:0;
			int y=(b!=null)? b.data:0;
			
			int sum=carry+x+y;
			carry=sum/10;
			tail.next=new ListNode(sum%10);
			tail=tail.next;
			if(a!=null) a=a.next;
			if(b!=null) b=b.next;
		}
		if(carry>0) {
			tail.next=new ListNode(carry);
		}
		head=dummy.next;
		return head;
	}
	
	public static void main(String[] args) {
		
		Add2LinkedList list=new Add2LinkedList();
		list.head=new ListNode(5);
		ListNode second=new ListNode(9);
		ListNode third=new ListNode(4);
		ListNode fourth=new ListNode(3);
		ListNode fifth=new ListNode(1);
		
		list.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		Add2LinkedList list1=new Add2LinkedList();
		list1.head=new ListNode(2);
		ListNode second1=new ListNode(6);
		ListNode third1=new ListNode(8);
		ListNode fourth1=new ListNode(7);
		
		list1.head.next=second1;
		second1.next=third1;
		third1.next=fourth1;
		
		System.out.println("First Linked List");
		list.display();
		System.out.println();
		System.out.println("Second Linked List");
		list1.display();
		System.out.println();
		System.out.println("LinkedList After Adding above List: ");
		Add2LinkedList finalList=new Add2LinkedList();
		finalList.add(list.head, list1.head);
		finalList.display();
	}

}


/*  Output
 *----------------------------
 * First Linked List
 * 5-->9-->4-->3-->1-->null
 * Second Linked List
 * 2-->6-->8-->7-->null
 * LinkedList After Adding above List: 
 * 7-->5-->3-->1-->2-->null
*/