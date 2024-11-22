public class Fruit 
{
    private String name;
    private boolean isBunchFruit;
    private double price;

    public Fruit(String name, boolean isBunchFruit, double price) 
    {
        this.name = name;
        this.isBunchFruit = isBunchFruit;
        this.price = price;
    }

    public void displayFruit() 
    {
        String type = isBunchFruit ? "Bunch Fruit" : "Single Fruit";
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}
