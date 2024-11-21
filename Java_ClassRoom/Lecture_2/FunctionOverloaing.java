`package com.gsv.basic;

import java.util.Scanner;

class Area
{
	 int area(int l, int w)  //Function overloading
	 {
		return(l*w);
	 }
	 double area(double r)
	 {
		 
		 return(Math.PI*r*r);
	 }
}
public class FunctionOverloaing 
{
   public static void main(String[] args) 
   {
	 Area ar = new Area();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Area of rectangle");
	 int l =  sc.nextInt();
	 int w =  sc.nextInt();
	
	 int area_result = ar.area(l, w);
	 System.out.println("Rectangle area :"+area_result);
	 System.out.println("Area of circle");
	 double d   = sc.nextDouble();
	 double area_circle  = ar.area(d);
	 System.out.println("Circle area :"+area_circle);
	 
	 
   }
}
