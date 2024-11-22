public class TheaterProfit 
{
    
    static final double TICKET_PRICE = 5.0;
    static final double FIXED_COST = 20.0;
    static final double COST_PER_ATTENDEE = 0.50;
    public static double calculateTotalProfit(int attendees) 
    {
        double totalRevenue = attendees * TICKET_PRICE;
        double totalCost = FIXED_COST + (attendees * COST_PER_ATTENDEE);
        return totalRevenue - totalCost;
    }

    public static void main(String[] args) 
    {
        int attendees = 100; 
        double totalProfit = calculateTotalProfit(attendees);
        
        System.out.printf("Number of Attendees: %d%n", attendees);
        System.out.printf("Total Profit: $%.2f%n", totalProfit);
    }
}
