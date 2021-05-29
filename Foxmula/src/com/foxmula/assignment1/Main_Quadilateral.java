/**
 * @author Mrinal Singh
 * 
 * Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral should be
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object's area (except Quadrilateral).
 * 
 * 
 *
 */
package com.foxmula.assignment1;

public class Main_Quadilateral {
	public static void main(String []args)
	{
		Square sq=new Square(10,10,20,10,20,20,10,20);
		System.out.println("Area Of The Square is " + sq.area());
		Rectangle rec=new Rectangle(10,10,30,10,30,20,10,20);
		System.out.println("Area Of The Rectangle is " + rec.area());
		Parallelogram p=new Parallelogram(10,10,30,10,20,20,0,20,8);
		System.out.println("Area Of The Parallelogram is " + p.area());
		Trapezoid t=new Trapezoid(10,10,30,10,40,20,0,20,8);
		System.out.println("Area Of The Trapezoid is " + t.area());
	}
}
