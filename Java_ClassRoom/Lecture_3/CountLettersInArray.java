package com.yang.book;

import java.util.Random;

class CountDemo
{
   public char[] createArray()
   {
	   char[] chars = new char[10];
	   char all[]={'a','b','c','d','e','f','h','i','z','t','p'};
	   
	   
	 
	   for(int i=0;i<chars.length;i++)
	   {
		   Random random = new Random();
		   int index = random.nextInt(10 - 0 + 1) + 0;
		   System.out.println(index);
		   chars[i]=all[index];
		   
	   }
	   return chars;
   }
   public void displayArray(char chars[])
   {
	   for(int i=0;i<chars.length;i++)
	   {
		   System.out.println(chars[i]);
	   }
   }
   public int[] countLetters(char[] chars)
   {
	   int[] counts = new int[26];
	   for(int i=0;i<chars.length;i++)
	   {
		   counts[chars[i]-'a']++;
	   }
	   return counts;
   }
   public void displayCounts(int[] counts)
   {
	   for(int i=0;i<counts.length;i++)
	   {
		   if(i%5==0)
		   {
			   System.out.println(counts[i]+" :"+(char)(i+'a'));
		   }
		   else
		   {
			   System.out.println(counts[i]+" :"+(char)(i+'a'));
		   }
	   }
   }
}
public class CountLettersInArray 
{
	public static void main(String[] args) 
	{
	   CountDemo cd  = new CountDemo();
	   char array[]= cd.createArray();
	   System.out.println("Display array");
	   cd.displayArray(array);
	   int counts[] = cd.countLetters(array);
	   cd.displayCounts(counts);
	   
	}
}
