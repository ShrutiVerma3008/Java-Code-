package com.gsv.arrayd;

interface Car
{
 public static final int WHEEL=4;
 public abstract void engine();
	
}
class Alto implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}
}
public class InterfaceManager 
{
  public static void main(String[] args) 
  {
	  Car tataalto  = new Alto();
	  System.out.println("Wheel "+Car.WHEEL);
	  tataalto.engine();
  }
}
