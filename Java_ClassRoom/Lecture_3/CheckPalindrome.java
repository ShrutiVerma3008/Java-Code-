package com.yang.book;

import java.util.Scanner;

public class CheckPalindrome 
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter string");
	  String s = sc.nextLine();
	  if(isPalindrome(s))
	  {
		  System.out.println("Palindrome");
	  }
	  else
	  {
		  System.out.println("Not Palindrome");
	  }
  }
  public static boolean isPalindrome(String s)
  {
	  int low=0;
	  int high= s.length()-1;
	  while(low<high)
	  {
		  if(s.charAt(low)!=s.charAt(high))
		  {
			  return false;
		  }
		  low++;
		  high--;
	  }
	  return true;
  }
}
