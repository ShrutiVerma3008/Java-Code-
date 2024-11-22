import java.util.Scanner;

public class SeparateDigits 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        String n = sc.nextLine();
        
     
        if (n.length() != 5 )
        {
            System.out.println("Invalid input. Please enter a five-digit number.");
        } 
        else 
        {
            
            for (int i = 0; i < n.length(); i++) 
            {
                System.out.print(n.charAt(i));
                if (i < input.length() - 1) 
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

