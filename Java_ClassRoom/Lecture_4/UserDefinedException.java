import java.util.Scanner;

public class UserDefinedException {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age<0){
            try{
            throw new AgeNegativeException("Age negative not possible");
            }
            catch(AgeNegativeException ex){
                ex.printStackTrace();
            }
        }
        else{
            System.out.println("User age is"+age);
        }
        }
    }
