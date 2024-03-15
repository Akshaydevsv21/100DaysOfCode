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
	
	public boolean findElement(int value) {
		ListNode current=head;
		while(current!=null) {
			if(current.data==value) {
				System.out.println("The element "+value+" exist in the LinkedList");
				return true;
			}
		current=current.next;
		}
		System.out.println("The element "+value+" doesn't exist in the LinkedList");
		return false;
		
	}
	
	public ListNode findMiddleElement() {
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public ListNode findnthElementfromLast(int n) {
		ListNode mainPtr=head;
		ListNode refPtr=head;
		
		int count=0;
		while(count<n) {
			refPtr=refPtr.next;
			count++;
		}
		while(refPtr!=null) {
			refPtr=refPtr.next;
			mainPtr=mainPtr.next;
		}
		return mainPtr;
	}
	
	//Methods to remove Duplicates from SinglyLinkedList
	
	public ListNode removeDuplicatesfromSLL() {
		
		ListNode current=head;
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
		return head;
		
	}
	
	//Method to insert a new node in a Sorted LinkedList
	
	public ListNode insertnewNodeinSortedSLL(ListNode newNode) {
		ListNode current=head;
		ListNode temp=null;
		while(current!=null && current.data<newNode.data) {
			temp=current;
			current=current.next;
		}
		newNode.next=current;
		temp.next=newNode;
		return head;
	}
	
	public static void main(String[] args) {
		
		SLL sl=new SLL();
		
		sl.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(30);
		ListNode fifth=new ListNode(40);
		ListNode sixth=new ListNode(50);
		ListNode seventh=new ListNode(50);
		
		sl.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=seventh;
		
		sl.insertFirst(5);
		sl.insertLast(60);
		sl.insertAtGivenIndex(70, 10);
		//sl.deleteFirst();
		//sl.deleteLast();
		sl.deletefromAnyPosition(6);
		sl.display();
		sl.findElement(60);
		System.out.println("The middle element of the LinkedList: "+sl.findMiddleElement().data);
		int n=3;
		System.out.println("The "+n+" element from last in LinkedList : "+sl.findnthElementfromLast(n).data);
		sl.removeDuplicatesfromSLL();
		sl.display();
		sl.insertnewNodeinSortedSLL(new ListNode(40));
		sl.display();
	}

}
