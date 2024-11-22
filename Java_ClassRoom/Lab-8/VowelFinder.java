package lab.Lab-8;

import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String input = sc.nextLine().toLowerCase();

        System.out.println("Vowels and their positions:");
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel: " + ch + " at position: " + i);
            }
        }

        sc.close();
    }
}

