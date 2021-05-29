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

public class Trapezoid extends Quadilateral
{
	public double height;
	Trapezoid(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4,double height)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);
		this.height=height;
	}
	int area()
	{
		int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2=(int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
		return (int)((d1+d2)*height)/2;
	}
}