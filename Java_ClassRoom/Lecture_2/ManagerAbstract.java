package com.gsv.arrayd;
abstract class A
{  
	void show()
	 {
		 System.out.println("Abstr show");
	 }
	abstract  void info();
	abstract  void display();
	
	A()
	{
		System.out.println("Abstract class constructor");
	}
}
abstract class B extends A 
{
	B()
	{
		super();
	}
	//abstract  void display();
	void info()
	{
	System.out.println("Info B");	
	}
	
}
class C extends B
{
	C()
	{
		super();
	}
   void display()
   {
	   System.out.println("C abstract");
   }
}
public class ManagerAbstract
{
  public static void main(String[] args) 
  {
	  //A a = new A(); Abstract class object not possible but Reference possible
	  A a = new C();
	  a.show();
	  a.info();
	  
	  
	  
  }
}
