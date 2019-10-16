package com.symantec;

public class LinkedListPracticeSingly {

	class Node
	{
		//Declare class variables
		private Node next;
		private int data;
		
		public Node(int dat)
		{
			data = dat;
		}
		
		public int getData()
		{
			return data;
		}
	}
	
	//Class variables for the Linked List -- first node in linked list will be head node. 
	// if linked list is empty that means head will be null in the beginning when no data inserted.
	
	private static Node head;
	private static int numNodes;
		
	public LinkedListPracticeSingly(int dat)
	{
		head = new Node(dat);
	}
	
	public static int getSize()
	{
		return numNodes;
	}
	
	public void printList()
	{
		Node temp = head;
		while(temp.next != null)
		{
			System.out.print(temp.data+"--");
			temp = temp.next;
		}
		//System.out.print(temp.data);
	}
	
	public static int find(Node n)
	{
		Node t = head;
		int index = 0;
		while(t != n)
		{
			index++;
			t = t.next;
		}
		return index;
	}
	
	public static Node find(int index)
	{
		Node temp=head;
		for(int i=0; i<index; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	
	public void addAtIndex(int index, int dat)
	{
		Node temp = head;
		Node holder;
		for(int i=0; i < index-1 && temp.next != null; i++)
		{
			temp = temp.next;
		}
		holder = temp.next;
		temp.next = new Node(dat);
		temp.next.next = holder;
		numNodes++;
	}
	
	public void deleteAtIndex(int index)
	{
		Node temp = head;
		for(int i=0; i< index - 1 && temp.next != null; i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		numNodes--;
	}
	
	public void addAtHead(int data)
	{
		Node temp = head;
		head = new Node(data);
		head.next = temp;
		numNodes++;
	}
	
	public void addAtTail(int dat)
	{
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = new Node(dat);
		numNodes++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListPracticeSingly ll = new LinkedListPracticeSingly(10);
		ll.addAtHead(11);
		ll.addAtHead(12);
		ll.addAtHead(13);
		System.out.println("\nData Size >>>>>> ["+getSize()+"]");
		ll.printList();
		
		ll.addAtTail(8);
		System.out.println("\nData Size >>>>>> ["+getSize()+"]");
		ll.printList();
		
		ll.addAtTail(7);
		System.out.println("\nData Size >>>>>> ["+getSize()+"]");
		ll.printList();
		
		ll.addAtIndex(4,19);
		System.out.println("\nData Size >>>>>> ["+getSize()+"]");
		ll.printList();
		
		//ll.addAtIndex(4,9);
		//ll.deleteAtIndex(4);
		//ll.printList();
	}

}
