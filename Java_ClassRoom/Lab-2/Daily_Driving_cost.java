
import java.util.Scanner;

class Toll{
    void total_cost(float miles, float gallon, float average, float toll){
        float daily_total_cost = miles*gallon + average + toll;
        System.out.println(daily_total_cost);
    }
}

class Daily_Driving_cost{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Total miles driven per day: ");
        float total_miles = input.nextInt();
        System.out.println("Cost per gallon of gasoline: ");
        float cost_gallon = input.nextInt();
        System.out.println("Average fee per day: ");
        float average_fee = input.nextFloat();
        System.out.println("Tolls per day: ");
        float toll = input.nextFloat();

        Toll t1 = new Toll();
        t1.total_cost(total_miles, cost_gallon, average_fee, toll);

        input.close();
    }

}