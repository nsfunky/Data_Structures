package com.symantec.linkedlist;

public class LinkedList {
	
	//Class variables for the Linked List -- first Node in linked list will be head Node. 
	// if linked list is empty that means head will be null in the beginning when no data inserted.
	
	public static int count;
	public Node head;	
	
	
	public static int getSize()
	{
		return count;
	}
	
	public void printList()
	{
		Node temp = head;
		while(temp.next != null)
		{
			System.out.print(temp.data+"--");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	
	public void insert(int dat)
	{
		Node Node = new Node();
		Node.data = dat;
		Node.next=null;
		
		if(head == null)
		{
			head= Node;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = Node;
		}
		
		count++;
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
		count++;
	}
	
	public void deleteAtIndex(int index)
	{
		Node temp = head;
		for(int i=0; i< index - 1 && temp.next != null; i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		count--;
	}

	public Node find(int index)
	{
		Node temp=head;
		for(int i=0; i<index; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	
	public int find(Node n)
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
	
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.insert(11);
		ll.insert(12);
		ll.insert(13);
		System.out.println("\nData Size >>>>>> ["+getSize()+"]");
		ll.printList();
		
		ll.addAtIndex(2, 20);
		System.out.println("\nData Size >>>>>> ["+getSize()+"]");
		ll.printList();
		
		ll.deleteAtIndex(2);
		System.out.println("\nData Size >>>>>> ["+getSize()+"]");
		ll.printList();
		
		System.out.println("\nData Size >>>>>> ["+ count +"]---at position 2 element available = "+ll.find(2).data);
		ll.printList();
	}

}
