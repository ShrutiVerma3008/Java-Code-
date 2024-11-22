import java.util.Scanner;

public class Book 
{
    protected int bookID;
    protected String title;
    protected String author;
    protected double price;

    public Book(int bookID, String title, String author, double price) 
    {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() 
    {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}


public class Periodical extends Book {
    private String period;

    public Periodical(int bookID, String title, String author, double price, String period) 
    {
        super(bookID, title, author, price);
        this.period = period;
    }

    public void modifyPrice(double newPrice) 
    {
        this.price = newPrice;
    }

    public void modifyPeriod(String newPeriod) 
    {
        this.period = newPeriod;
    }

    @Override
    public void displayBookDetails() 
    {
        super.displayBookDetails();
        System.out.println("Period: " + period);
    }
}


public class PeriodicalTest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Periodical periodical = new Periodical(1, "Science Weekly", "John Doe", 5.99, "Weekly");

        System.out.println("Initial Periodical Details:");
        periodical.displayBookDetails();

        System.out.println("\nEnter new price: ");
        double newPrice = sc.nextDouble();
        sc.nextLine();  // consume newline
        System.out.println("Enter new period: ");
        String newPeriod = sc.nextLine();

        periodical.modifyPrice(newPrice);
        periodical.modifyPeriod(newPeriod);

        System.out.println("\nUpdated Periodical Details:");
        periodical.displayBookDetails();

        sc.close();
    }
}
