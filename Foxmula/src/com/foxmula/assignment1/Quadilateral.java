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



public class Quadilateral
{
	public double x1,x2,x3,x4,y1,y2,y3,y4;
	public  Quadilateral(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.x3=x3;
		this.y3=y3;
		this.x4=x4;
		this.y4=y4;
	}
}

