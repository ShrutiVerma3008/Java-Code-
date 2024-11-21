package com.gsv.arrayd;

abstract class Shape
{
	abstract void area(int l,int w);
}
class Rectangle extends Shape
{
	void area(int l,int w)
	{
		System.out.println("Rect area :"+(l*w));
	}
}
class Triangle extends Shape
{
	void area(int l,int w)
	{
		System.out.println("Rect area :"+(l+w)/2);
	}
	
}
public class AbstractDemo 
{
  public static void main(String[] args) 
  {
	  Shape resh  = new Rectangle();
	  resh.area(10, 23);
	  Shape retr = new Triangle();
	  retr.area(3, 2);
  }
}
