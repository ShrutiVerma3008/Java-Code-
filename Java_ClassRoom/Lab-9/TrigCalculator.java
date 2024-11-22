package lab.Lab-9;


    import java.util.Scanner;

class SinCalculator implements Runnable 
{
    private double x;
    private int terms;
    private double result;

    public SinCalculator(double x, int terms) 
    {
        this.x = x;
        this.terms = terms;
    }

    @Override
    public void run() 
    {
        result = calculateSin(x, terms);
    }

    private double calculateSin(double x, int terms) 
    {
        double sin = 0.0;
        for (int n = 0; n < terms; n++) 
        {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / factorial(2 * n + 1);
            sin += term;
        }
        return sin;
    }

    private double factorial(int n) 
    {
        double fact = 1;
        for (int i = 1; i <= n; i++) 
        {

            fact *= i;
        }
        return fact;
    }

    public double getResult() 
    {
        return result;
    }
}

class CosCalculator implements Runnable 
{
    private double x;
    private int terms;
    private double result;

    public CosCalculator(double x, int terms) 
    {
        this.x = x;
        this.terms = terms;
    }

    @Override
    public void run() 
    {
        result = calculateCos(x, terms);
    }

    private double calculateCos(double x, int terms) 
    {
        double cos = 0.0;
        for (int n = 0; n < terms; n++) 
        {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial(2 * n);
            cos += term;
        }
        return cos;
    }

    private double factorial(int n) 
    {
        double fact = 1;
        for (int i = 1; i <= n; i++) 
        {
            fact *= i;
        }
        return fact;
    }

    public double getResult() 
    {
        return result;
    }
}

public class TrigCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x (in radians): ");
        double x = sc.nextDouble();
        System.out.print("Enter the number of terms for series approximation: ");
        int terms = sc.nextInt();

        SinCalculator sinCalc = new SinCalculator(x, terms);
        CosCalculator cosCalc = new CosCalculator(x, terms);
        Thread sinThread = new Thread(sinCalc);
        Thread cosThread = new Thread(cosCalc);

        sinThread.start();
        cosThread.start();

        try 
        {
            sinThread.join();
            cosThread.join();
        } 
        catch (InterruptedException e) 
        {
            System.out.println(e);
        }

        double sinResult = sinCalc.getResult();
        double cosResult = cosCalc.getResult();

        System.out.println("Calculated sin(x) using series: " + sinResult);
        System.out.println("Math.sin(x): " + Math.sin(x));
        System.out.println("Calculated cos(x) using series: " + cosResult);
        System.out.println("Math.cos(x): " + Math.cos(x));

        sc.close();
    }
}

    

