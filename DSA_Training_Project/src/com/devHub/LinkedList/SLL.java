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
		//System.out.println("Anjitha N Namboothiri loves Akshay Dev");
	}
	
	public ListNode insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
		return newNode;
		
	}
	
	public ListNode insertLast(int value) {
		ListNode newNode=new ListNode(value);
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
		return head;
	}
	
	public ListNode insertAtGivenIndex(int value, int pos) {
		ListNode newNode=new ListNode(value);
		if(pos==1) {
			newNode.next=head;
			head=newNode;
		}
		else {
			ListNode previous=head;
			int count=1;
			while(count<pos-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			newNode.next=current;
			previous.next=newNode;
		}
		return head;
	}

	public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	
	public ListNode deleteLast() {
		if(head==null||head.next==null) {
			return head;
		}
		
		ListNode current=head;
		ListNode previous=null;
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		previous.next=null;
		return current;
		
	}
	
	public void deletefromAnyPosition(int pos) {
		if(pos==1) {
			head=head.next;
		}
		else {
			ListNode previous=head;
			int count=1;
			while(count<pos-1) {
				previous=previous.next;
				count++;
			}
			ListNode temp=previous.next;
			previous.next=temp.next;
		}
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
		
		sl.insertFirst(5);
		sl.insertLast(60);
		sl.insertAtGivenIndex(70, 8);
		sl.deleteFirst();
		sl.deleteLast();
		sl.deletefromAnyPosition(6);
		sl.display();

	}

}
