package com.foxmula.assignment1;




public class Stack
{
	
    private class Node 
    {
        int data; 
        Node link; 
    }
    
    Node top; 	
    Node head;
    
   public Stack() 	
    {
        this.top = null;
    }
 
    public void push(int x) 
    {	
    	Node temp = new Node();	
 
        temp.data = x;    
        temp.link = top;  
 
        top = temp;		
    }
 
    public void pop() 
    {
        if (top == null)      
        {
            System.out.print("\nStack Underflow");
            return;
        }
        else
        {
        	System.out.println("Poped element : "+ top.data);
            top = top.link;   
        }
    }
    
    public boolean isEmpty() 
    {
        return top == null;
    }
 
	public int count()     
	{     
		  int count = 0;
		  Node temp=top;
		  while(temp!=null)
		  {
		   temp=temp.link;
		   count++;  
		  }
		  return count;
	}
	
	public static void display(Stack St1, Stack St2)   
	{
		if(St1.count()==St2.count())
		{
			System.out.println("Total number of elements in both stack are same: "+St1.count());
		}
	}

	
	
}
