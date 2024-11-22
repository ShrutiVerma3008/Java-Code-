import java.util.Scanner;
 class circle{
    double diameter(float r){
        return r*2;
    }
    double circum(float r){
        return Math.PI*r*2;
    }
    double area(float r){
        return Math.PI*Math.pow(r, 2);
    }

 }

public class lab1_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float r = sc.nextFloat();

        circle ch = new circle();
        System.out.println("The diameter "+ch.diameter(r));
        System.out.println("The circumfere "+ch.circum(r));
        System.out.println("The area "+ch.area(r));


    }
    
}
