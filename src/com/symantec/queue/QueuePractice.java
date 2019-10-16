package com.symantec.queue;

public class QueuePractice {
	
	  private static class Node{		   
	       private int data;
		   private Node next;
		   
		   private Node(int data){
		     this.data=data;
		   }
	   }
	   
	  private Node front;  // remove thing from here means from front
	  private Node rear;  // add things from here means from rear
	  private int size = 0;
	   
	   public boolean isEmpty(){
		 return front==null;  
	   }

	   public int peek(){
		   if(getSize()==0){
			   System.out.println("Queue is Empty");
	            return -1;
	        }
		   else{
			   return front.data;
		   }
	   }
	   

	   public void enQueue(int data){
		   Node node = new Node(data);
		   // If queue is empty, then new node is front and rear both 
		   if (rear == null) 
	        { 
	           front = rear = node; 
	           System.out.println("Element "+ data + " is inserted to Queue");
	           size++;
	           return; 
	        } 
		   // Add the new node at the end of queue and change rear
		   if(rear !=null)
		   {
				  rear.next = node;	
		   }
		   // so update rear now with new node
		   rear = node;
		  
		   System.out.println("Element "+ data + " is inserted to Queue");
	       size++;
	   }
	   
	   
	    public int deQueue(){
	    	// If queue is empty, return NULL. 
			   if(front==null){
				   System.out.println("Queue is Empty");
		            return -1;
		        }
			   
			   //Store previous front and move front one node afront 
				Node tmp = front;
				front = front.next;
				
				// If front becomes NULL, then change rear also as NULL
				if(front==null){
					   System.out.println("Queue is Empty");
					   size--;
			            return -1;
			        }
				
				size--;
				return tmp.data;
		   }

	   public int getSize(){
	        return size;
	    }
	   

	    public void printStack(){
	        Node curr = front;
	        while(curr!=null){
	            System.out.print(curr.data + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueuePractice qp = new QueuePractice();
		System.out.println("Before adding any element to Queue using Linked List \n");
		qp.printStack();
        
		qp.enQueue(1);
		qp.enQueue(2);
		qp.enQueue(3);
		qp.enQueue(4);
		
		System.out.println("\n After adding any element to Queue using Linked List \n");
		qp.printStack();
		
		System.out.println("\n Pop element >> "+qp.deQueue());
		
		System.out.println("\n Size of Queue after pop>>>>>"+qp.getSize());
		
		System.out.println("\n Peek element >> "+qp.peek());
		
		System.out.println("\n Size of Queue after peek>>>>>"+qp.getSize());
		
		System.out.println("\n Pop element >> "+qp.deQueue());
		
		System.out.println("\n Stack Empty >> "+qp.isEmpty());
		
		System.out.println("\n Size of Queue at the end >>>>>"+qp.getSize());
		
		qp.printStack();
	}

}
