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
	
	//Method to Delete node at first position of LinkedList
	public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		
		ListNode current=head;
		head=head.next;
		current.next=null;
		return current;
	}
	
	//Method to Delete node at Last position of LinkedList
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
	
	//Method to Delete node at a given position of LinkedList
	public ListNode delete(int pos) {
		ListNode current=null;
		if(pos==1) {
			current=head;
			head=head.next;
			return current;
		}
		ListNode previous=head;
		int count=1;
		while(count<pos-1) {
			previous=previous.next;
			count++;
		}
		current=previous.next;
		previous.next=current.next;
		return current;
	}
	
	//Method to Search for an Element in LinkedList
	public boolean SearchLL(int key) {
		if(head==null) {
			System.out.println("Linked List is Empty");
			return false;
		}
		ListNode current=head;
		while(current!=null) {
			if(current.data==key) {
				System.out.println("Element "+key+" exists in SinglyLinkedList");
				return true;
			}
			current=current.next;
		}
		System.out.println("Element "+key+" does not exist in SinglyLinkedList");
		return false;
	}
	
	//Method to Reverse a LinkedList
	public ListNode reverseList() {
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
			//System.out.print(previous.data+"-->");
			
		}
		head=previous;
		return head;
	}
	
	//Method to find Middle Node of a SinglyLinkedList
	public ListNode findMiddleNode() {
		if(head==null) {
			return null;
		}
		else if(head.next==null) {
			return head;
		}
		
		ListNode slowPtr=head;
		ListNode fastPtr=head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}
	
	//Method to find nth Node from end of a SinglyLinkedList
	public ListNode getNthNodefromEnd(int n) {
		if(head==null) {
			return null;
		}
		
		if(n<=0) {
			throw new IllegalArgumentException("Invalid input "+n);
		}
		int count=0;
		ListNode mainPtr=head;
		ListNode refPtr=head;
		while(count<n) {
			if(refPtr==null) {
				throw new IllegalArgumentException(n+" is bigger than Number of Nodes in list");
			}
			refPtr=refPtr.next;
			count++;
		}
		
		while(refPtr!=null) {
		
			refPtr=refPtr.next;
			mainPtr=mainPtr.next;
		}
		return mainPtr;
	}
	
	//Method to remove Duplicates from a  SinglyLinkedList
	public void removeDuplicates() {
		if(head==null) {
			return;
		}
		
		ListNode current=head;
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
	}
	
	//Method to insert new node in a Sorted SinglyLinkedList
	public ListNode insertinSortedLinkedList(int value) {
		ListNode newNode=new ListNode(value);
		
		if(head==null) {
			return newNode;
		}
		
		ListNode current=head;
		ListNode previous=null;
		
		while(current!=null && current.data<newNode.data) {
			previous=current;
			current=current.next;
		}
		newNode.next=current;
		previous.next=newNode;
		return head;
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(5);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(9);
		ListNode fourth=new ListNode(11);
		ListNode fifth=new ListNode(11);
		ListNode sixth=new ListNode(22);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		
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
		sll.insert(10,pos);
		System.out.println("Linked List After Inserting New node at the "+pos+" position : ");
		sll.display();
		System.out.println();

		System.out.println("Linked List After Deleting first node "+sll.deleteFirst().data+" in Linked List: ");
		sll.display();
		System.out.println();

		System.out.println("Linked List After Deleting Last node "+sll.deleteLast().data+" in Linked List: ");
		sll.display();
		System.out.println();
		
		pos=1;
		System.out.println("Linked List After Deleting node "+sll.delete(pos).data+" at the "+pos+" position : ");
		sll.display();
		System.out.println();
		
		sll.SearchLL(54);
		sll.display();
		System.out.println();
		//sll.reverseList();
		//System.out.println("Reversed Linked List: ");
		//sll.display();
		//System.out.println();
		System.out.println("Middle Node of Linked List: "+sll.findMiddleNode().data);
		System.out.println();
		
		int n=3;
		if(n==1) {
			System.out.println(n+"st node from end of SinglyLinkedList: "+sll.getNthNodefromEnd(n).data);
		}
		else if(n==2 || n==3) {
			System.out.println(n+"rd node from end of SinglyLinkedList: "+sll.getNthNodefromEnd(n).data);
		}
		else {
			System.out.println(n+"th node from end of SinglyLinkedList: "+sll.getNthNodefromEnd(n).data);
		}
		System.out.println();
		System.out.println("LinkedList After Removing Duplicates: ");
		sll.removeDuplicates();
		sll.display();
		System.out.println();
		int val=17;
		System.out.println("LinkedList After Inserting Node "+val+" in Sorted LinkedList: ");
		sll.insertinSortedLinkedList(17);
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
 * Linked List After Deleting first node 9 in Linked List: 
 * 5-->7-->4-->54-->10-->23-->45-->null
 * Linked List After Deleting Last node 45 in Linked List: 
 * 5-->7-->4-->54-->10-->23-->null
 * Linked List After Deleting node 5 at the 1 position : 
 * 7-->4-->54-->10-->23-->null
 * Element 54 exists in SinglyLinkedList
 * Reversed Linked List: 
 * 23-->10-->54-->4-->7-->null
 * Middle Node of Linked List: 54
 * 3rd node from end of SinglyLinkedList: 54
 * LinkedList before Removing Duplicates: 
 * 23-->10-->10-->54-->4-->7-->null
 * LinkedList After Removing Duplicates: 
 * 23-->10-->54-->4-->7-->null
 * LinkedList After Inserting Node 17 in Sorted LinkedList: 
 * 8-->9-->10-->11-->17-->22-->null
 */
