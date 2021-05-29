package com.foxmula.assignment1;
/*
  @author Mrinal Singh
 
 Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and checkEmpty (
) operations on the stack. Create two stacks and write a menu-driven program to perform operations on
the two stacks. Whenever the number of elements in the two stacks becomes equal, a message should
automatically be generated displaying the number of elements in each stack.

 */
import java.util.Scanner;

public class Main_stack  {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Stack s1=new Stack();
		Stack s2=new Stack();
		Stack s3=new Stack();
		int a,data;
		while(true)
		{
			System.out.println("\n1. Push in Stack 1");
			System.out.println("2. Pop in Stack 1");
			System.out.println("3. Push in Stack 2");
			System.out.println("4. Pop in Stack 2");
			System.out.println("Enter Your Choice : ");
			a=sc.nextInt();
			switch(a)
			{
				case 1:
					System.out.println("Enter The Data");
					data=sc.nextInt();
					s1.push(data);
					s3.display(s1,s2);
				break;
				case 2:
					s1.pop();
					s3.display(s1,s2);
				break;
				case 3:
					System.out.println("Enter The Data");
					data=sc.nextInt();
					s2.push(data);
					s3.display(s1,s2);
				break;
				case 4:
					s2.pop();
					s3.display(s1,s2);
				break;
				default:
					System.exit(0);
					break;
			}
			
	}
		
	}
	
}
