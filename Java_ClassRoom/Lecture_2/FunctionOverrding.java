package com.gsv.basic;

class Sample   //Function overrding
{
   void show()  //1
   {
	   System.out.println("Sample show");
   }
}
class Register extends Sample
{
	 void show()  //1+1  //Function overrding dependent on return type
	   {
		   System.out.println("Register show");
	   }
	 void show(int i)  //1+1  //Function overrding dependent on return type
	   {
		   System.out.println("Register show"+i);
	   }
}
public class FunctionOverrding
{
   public static void main(String[] args) 
   {
     //Sample s1  = new Sample();
     //s1.show();
     Register r1  = new Register();
     r1.show();
     r1.show(12);
   }
   
}
