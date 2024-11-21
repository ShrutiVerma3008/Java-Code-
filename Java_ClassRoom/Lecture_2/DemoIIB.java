package com.gsv.pack1;

class A
{
	static int count=0;
	A()
	{   this(10);
		System.out.println("A ..");
		System.out.println(count);
	}
	A(int i)
	{
		System.out.println("A "+i);
	}
	{
		System.out.println("IIB");
	}
	
}
class B extends A
{
	B()
	{
		super();
		System.out.println("B con");
	}
}
public class DemoIIB 
{
  public static void main(String[] args) 
  {
	A a = new B();
	
  }
}
