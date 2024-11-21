package com.gsv.pack1;

import java.util.Scanner;

class ArrayDemo
{
   Scanner sc = new Scanner(System.in);
   int [][] inputArray(int a[][])
   {
	   
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
	  	 {
		     a[i][j] = sc.nextInt();	 
		 }
	 }
	 
	 return a;
   }
   void displayArray(int a[][])
   {
	   
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
	  	 {
		    System.out.print(a[i][j]+"\t");	 
		 }
		 System.out.println();
	 }
	 
   }
   int [][] sumArray(int a[][], int b[][])
   {
	   
	  int re[][]= new int [3][3]; 
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<a[i].length;j++)
	  	 {
		     re[i][j] = a[i][j] +b[i][j];	 
		 }
	 }
	 
	 return re;
   }
}
public class ArrayOperation 
{
  public static void main(String[] args) 
  {
	  int  a[][] = new int[3][3];
	  int  b[][] = new int[3][3];
	  int  re[][] = new int[3][3];
	  ArrayDemo ad = new ArrayDemo();
	  a = ad.inputArray(a);
	  b = ad.inputArray(b);
	  ad.displayArray(a);
	  ad.displayArray(b);
	  re = ad.sumArray(a,b);
	  System.out.println("Result");
	  ad.displayArray(re);
	  /*
	  int days[] =new int[6];
	  for(int i=0;i<days.length;i++)
	  {
	     days[i] = 
	  }
	  */
	   
	  
	  
	  
	  
  }
}

