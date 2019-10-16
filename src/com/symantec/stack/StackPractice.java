package com.symantec.stack;

public class StackPractice {
	
	  private static class Node{		   
	       private int data;
		   private Node next;
		   
		   private Node(int data){
		     this.data=data;
		   }
	   }
	   
	   private Node top = null;
	   private int size = 0;
	   
	   public boolean isEmpty(){
		 return top==null;  
	   }

	   public int peek(){
		   if(getSize()==0){
			   System.out.println("Stack is Empty");
	            return -1;
	        }
		   else{
			   return top.data;
		   }
	   }
	   
	   public void push(int data){
		   Node node = new Node(data);
		   if(getSize()==0){
	            top = node;
	        }
		   else{
			Node tmp = top;
			node.next = tmp;
			top = node;
	       }
		   System.out.println("Element "+ data + " is pushed into Stack");
	       size++;
	   }
	   
	   public int pop(){
		   if(getSize()==0){
			   System.out.println("Stack is Empty");
	            return -1;
	        }
		   else{
			Node tmp = top;
			top = top.next;
			size--;
			return tmp.data;
		   }
	   }

	   public int getSize(){
	        return size;
	    }
	   

	    public void printStack(){
	        Node curr = top;
	        while(curr!=null){
	            System.out.print(curr.data + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackPractice sp = new StackPractice();
		System.out.println("Before adding any element to Stack using Linked List \n");
		sp.printStack();
        
		sp.push(1);
		sp.push(2);
		sp.push(3);
		sp.push(4);
		
		System.out.println("\n After adding any element to Stack using Linked List \n");
		sp.printStack();
		
		System.out.println("\n Pop element >> "+sp.pop());
		
		System.out.println("\n Size of stack after pop>>>>>"+sp.getSize());
		
		System.out.println("\n Peek element >> "+sp.peek());
		
		System.out.println("\n Size of stack after peek>>>>>"+sp.getSize());
		
		System.out.println("\n Pop element >> "+sp.pop());
		
		System.out.println("\n Stack Empty >> "+sp.isEmpty());
		
		System.out.println("\n Size of stack at the end >>>>>"+sp.getSize());
		
		sp.printStack();
	}

}
