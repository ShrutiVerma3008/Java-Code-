public class TaxCalculator 
{


    public static final double HOURLY_RATE = 12.0;
    public static final double TAX_RATE = 0.15;

    public static double calculateTax(double grossPay)
    {
        return grossPay * TAX_RATE;
    }

    public static double calculateNetPay(int hoursWorked) 
    {
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args)
     {
        int hoursWorked = 40;

        double netPay = calculateNetPay(hoursWorked);
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax = calculateTax(grossPay);

        System.out.printf("Hours Worked: %d%n", hoursWorked);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Net Pay: $%.2f%n", netPay);
    }
}
