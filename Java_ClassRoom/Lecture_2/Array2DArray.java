package com.gsv.arrayd;

import java.util.Arrays;
import java.util.Scanner;

class ArrayOperation
{
	Scanner sc = new Scanner(System.in);
	int[][] inputArray(int a[][])
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
	int[][] addArray(int a[][],int b[][])
	{
		//int sum[][] = new int[a.length][a[0].length];
		int sum[][] = new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum[i][j] = a[i][j]+ b[i][j];
			}
		}
		return sum;
	}
}
public class Array2DArray 
{
   public static void main(String[] args) 
   {
	  int a[][] = new int[3][3];
	  int b[][] = new int[3][3];
	  int sum[][] = new int[3][3];
	  ArrayOperation ao  = new ArrayOperation();
	  //Scanner sc = new Scanner(System.in);
	  System.out.println("Input a array elements");
	  a = ao.inputArray(a);
	  System.out.println("Print a array");
	  ao.displayArray(a);
	  System.out.println("Input b array elements");
	  b = ao.inputArray(b);
	  System.out.println("Print b array");
	  ao.displayArray(b);
	  System.out.println("Sum of A and B");
	  sum  = ao.addArray(a, b);
	  ao.displayArray(sum);
	  
	  
	  
   }
}
