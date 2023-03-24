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
	
	//Method defined to find the length of the Linked List
	public int length() {
		if(head==null) {
			return 0;
		}
		
		int count=0;
		ListNode current =head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	//Method to Insert new node at beginning of LinkedList
	public void insertFirst(int value) {
		ListNode lt=new ListNode(value);
		lt.next=head;
		head=lt;
	}
	
	//Method to Insert new node at the end of LinkedList
	public void insertLast(int value) {
		ListNode lt=new ListNode(value);
		if(head==null) {
			head=lt;
			return;
		}
		
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=lt;
	}
	
	//Method to Insert new node at a Given position of LinkedList
	public void insert(int data,int pos){
		ListNode lt=new ListNode(data);
		if(pos==1) {
			lt.next=head;
			head=lt;
		}
		else {
			ListNode previous=head;
			int count=0;
			while(count<pos-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			lt.next=current;
			previous.next=lt;
		}
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
		System.out.println();
		System.out.println("Length of the SinglyLinked List: "+sll.length());
		
		sll.insertFirst(9);
		System.out.println("Linked List After Inserting New node at Beginning: ");
		sll.display();
		System.out.println();
		
		sll.insertLast(45);
		System.out.println("Linked List After Inserting New node at the End: ");
		sll.display();
		System.out.println();
		
		int pos=4;
		sll.insert(54,pos);
		System.out.println("Linked List After Inserting New node at the "+pos+" position : ");
		sll.display();
		
	}

}


/*  Output
 *----------------------------
 * 5-->7-->4-->10-->23-->null
 * Length of the SinglyLinked List: 5
 * Linked List After Inserting New node at Beginning: 
 * 9-->5-->7-->4-->10-->23-->null
 * Linked List After Inserting New node at the End: 
 * 9-->5-->7-->4-->10-->23-->45-->null
 * Linked List After Inserting New node at the 4 position : 
 * 9-->5-->7-->4-->54-->10-->23-->45-->null
 */
