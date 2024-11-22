package lab.Lab-8;

import java.util.Arrays;

public class NameProcessor 
{
    public static void main(String[] args) {
        // Given set of 10 names
        String[] names = {"Alexander", "Benjamin", "Charlotte", "Dorothy", "Edward", "Fiona", "George", "Harriet", "Isabella", "James"};

        for (int i = 0; i < names.length; i++) 
        {
            if (names[i].length() > 3) 
            {
                names[i] = names[i].substring(3);
            } else {
                names[i] = "";
            }
        }

        Arrays.sort(names);

        System.out.println("Sorted names after removing the first three characters:");
        for (String name : names) 
        {
            System.out.println(name);
        }
    }
}

