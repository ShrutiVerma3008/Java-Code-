class Person
{
  int age;
  float weight;
  double height;
  double runFast()
  {
    return((age*weight)/height);
  } 
  Person(int age,float weight,double height)
  {
     this.age = age;
     this.weight = weight;
     this.height  = height;
  }
}
class PersonManager1
{
	public static void main(String []args)
	{
	  Person kumar = new Person(45,56.4f,5.6);
	         
	  double k_speed  = kumar.runFast();
	  System.out.println("Kumar speed "+k_speed);
	  Person kiran = new Person(45,57.3f,5.4);
	         
	  double kr_speed  = kiran.runFast();
	  System.out.println("Kiran speed "+kr_speed);
	}
}       