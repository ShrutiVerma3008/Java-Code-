package com.gsv.basic;

class A  extends Object
{
	A()
	{
	   super();	  ///First line constructor is super()
	   System.out.println("Default constructor");
    		
	}
}
public class ConstructorDemo 
{
   public static void main(String[] args) 
   {
	   A a = new A();
   }
}
