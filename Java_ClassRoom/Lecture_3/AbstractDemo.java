package com.gsv.arrayd;

abstract class Shape
{
	abstract void area(int l,int w);
}
class Rectangle extends Shape
{
	void area(int l,int w)
	{
		System.out.println("Rectangle area :"+(l*w));
	}
}
class Triangle extends Shape
{
	void area(int l,int w)
	{
		System.out.println("Triangle area :"+(l+w)/2);
	}
	
}
public class AbstractDemo 
{
  public static void main(String[] args) 
  {
	  Shape rect1  = new Rectangle();
	  rect1.area(10, 23);
	  Shape rect2 = new Triangle();
	  rect2.area(3, 2);
  }
}
