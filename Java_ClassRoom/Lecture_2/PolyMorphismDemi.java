package com.gsv.basic1;

class A
{
	static final float PI=3.14f;
	final  void show()
	 {
		 System.out.println("A show");
	 }
	 
}
class B extends A
{
	/*  Final method not overrding
	 void show()
	 {
		 System.out.println("B show");
	 }
	 */
}
class C extends B
{
	/*
	 void show()
	 {
		 System.out.println("C show");
	 }
	 */
}

public class PolyMorphismDemi 
{
  public static void main(String[] args) 
  {
	    //B.show();
	  A all[]  =new A[3];
	  all[0] = new A();
	  all[1] = new B();
	  all[2] = new C();
	  for(int i=0;i<all.length;i++)
	  {
		  all[i].show();
	  }
	  
  }
}

