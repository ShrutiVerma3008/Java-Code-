// Superclass
class Animal 
{
    protected String name;

    public Animal(String name)
    {
        this.name = name;
    }


    public void display() 
    {
        System.out.println("Animal name: " + name);
    }
}
 
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) 
    {
        super(name); 
        this.breed = breed;
    }

    public void display() 
    {
        super.display(); 
        System.out.println("Breed: " + breed);
    }
}

public class SuperThisExample 
{
    public static void main(String[] args) 
    {
        Dog dog = new Dog("Max", "Golden Retriever");
        dog.display();
    }
}
