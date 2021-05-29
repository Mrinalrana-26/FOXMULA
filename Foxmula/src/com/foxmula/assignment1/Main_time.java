package com.foxmula.assignment1;
/*
 * @author Mrinal Singh
 * 
 * Create a class called Time, which has three private instance variables – hour, min and sec. It contains a
method called add ( ) which takes one Time object as parameter and print the added value of the calling
Time object and passes Time object. In the main method, declare two Time objects and assign values
using constructor and call the add ( ) method.

 */
public class Main_time {
	public static void main(String args[]) {
		Time t1 = new Time(9, 14, 30);
		Time t2= new Time(3, 35, 0);
		Time AddedTime =  new Time(0,0,0);
		AddedTime=AddedTime.add(t1, t2);
		AddedTime.print(AddedTime);
	}
}
