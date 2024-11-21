
class A1  //7   //Super class 
{
	
	A1(int i) //5
	{
		this();//6  Class the Object Constr
		System.out.println("A1 cons "+i); //4
	}
	A1()//7
	{
	   super(); //8
		
	}
}

class B extends A1  //Sub class /Derived class
{
	B(int i) ////3     //Constructor Overloading
	{
		this(11,33.4f);//4  //Same class Constructor call
		System.out.println("B Con"+i);
	}
	B()//1
	{   this(10);//2
		System.out.println("GSV : AIDS");
	}
	B(int i, float j)
	{
		super(10);
	}
	
}
public class ConstructorDemo1 
{
   public static void main(String[] args) 
   {
	    //A1 a1 = new A1();
	    B b = new B();   //Deriver class object we can access member of super class
   }
}
