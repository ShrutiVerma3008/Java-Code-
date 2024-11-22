package lab.Lab-8;

import java.util.Scanner;

public class TextProcessor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = sc.nextLine();

        int firstPos = input.indexOf("the");
        int lastPos = input.lastIndexOf("the");

        if (firstPos == -1 || lastPos == -1 || firstPos == lastPos) 
        {
            System.out.println("The word 'the' does not occur twice in the input.");
        } 
        else 
        {
            String enclosedText = input.substring(firstPos + 3, lastPos);
            System.out.println("Text enclosed between the first and last occurrence of 'the':");
            System.out.println(enclosedText);
        }

        sc.close();
    }
}

