import java.util.Scanner;

public class WashingMachine 
{
    private boolean isOn;
    private int noOfClothes;
    private boolean detergentAdded;

    public void switchOn() 
    {
        isOn = true;
        System.out.println("Washing machine is now ON.");
    }

    public int acceptClothes(int noOfClothes) 
    {
        if (isOn) 
        {
            this.noOfClothes = noOfClothes;
            System.out.println(noOfClothes + " clothes accepted.");
            return noOfClothes;
        } 
        else 
        {
            System.out.println("Switch on the washing machine first.");
            return 0;
        }
    }

    public void acceptDetergent() 
    {
        if (isOn) 
        {
            detergentAdded = true;
            System.out.println("Detergent added.");
        } 
        else 
        {
            System.out.println("Switch on the washing machine first.");
        }
    }

    public void switchOff() 
    {
        isOn = false;
        System.out.println("Washing machine is now OFF.");
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        WashingMachine wm = new WashingMachine();

        wm.switchOn();
        
        System.out.print("Enter the number of clothes: ");
        int clothes = scanner.nextInt();
        wm.acceptClothes(clothes);
        
        wm.acceptDetergent();

        wm.switchOff();
        scanner.close();
    }
}
