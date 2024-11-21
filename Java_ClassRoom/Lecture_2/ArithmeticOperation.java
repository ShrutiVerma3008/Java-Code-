package com.gsv;

import java.util.Scanner;

class Basic  // operation class
{
	void addOperation(int a, int b)
	{
		int sum  = a+b;
		System.out.println("Sum :"+sum);
	}
	void subOperation(int a, int b)
	{
		int sub  = a-b;
		System.out.println("Sub :"+sub);
	}
	void divOperation(int a, int b)
	{
		int div  = a/b;
		System.out.println("Div :"+div);
	}
	void mulOperation(int a, int b)
	{
		int mul  = a*b;
		System.out.println("Mul :"+mul);
	}
}
public class ArithmeticOperation  // Controller //Main Class
{
  public static void main(String[] args) 
  {
	  Scanner sc  = new Scanner(System.in);
	  Basic ba  = new Basic();
	  int ch=0;
	  
	  do 
	  {
		  System.out.println("1 add  2 sum 3 div 4 mul 5 exit ");
		  System.out.println("Enter your choice");
		  ch  = sc.nextInt();
		   
		  System.out.println("Enter a and b ");
		  int a = sc.nextInt();
		  int b  = sc.nextInt();
		  switch(ch)
		  {
		    case 1:
			  ba.addOperation(a, b);
			  break;
		    case 2:
			  ba.subOperation(a, b);
			  break;
		    case 3:
				  ba.divOperation(a, b);
				  break;
			case 4:
				  ba.mulOperation(a, b);
				  break;
		    default:
		    	  System.exit(1);
		   }
		  
	  }
	  while(ch<4);
		  
			  
  }
}
