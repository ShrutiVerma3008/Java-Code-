import java.util.Scanner;

class Vehicle {
    protected String mdl;
    protected String clr;
    protected int yr;

    public Vehicle(String mdl, String clr, int yr) {
        this.mdl = mdl;
        this.clr = clr;
        this.yr = yr;
    }

    public void display() {
        System.out.println("Model: " + mdl);
        System.out.println("Color: " + clr);
        System.out.println("Year: " + yr);
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String mdl, String clr, int yr, int doors) {
        super(mdl, clr, yr);
        this.doors = doors;
    }

    public void display() {
        super.display();
        System.out.println("Doors: " + doors);
    }
}

class Bicycle extends Vehicle {
    private boolean gear;

    public Bicycle(String mdl, String clr, int yr, boolean gear) {
        super(mdl, clr, yr);
        this.gear = gear;
    }

    public void display() {
        super.display();
        System.out.println("Has Gear: " + (gear ? "Yes" : "No"));
    }
}

// Subclass Scooter
class Scooter extends Vehicle {
    private String engType;

    public Scooter(String mdl, String clr, int yr, String engType) {
        super(mdl, clr, yr);
        this.engType = engType;
    }

    public void display() {
        super.display();
        System.out.println("Engine Type: " + engType);
    }
}


public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Car input
        System.out.println("Enter Car details:");
        System.out.print("Model: ");
        String carMdl = sc.nextLine();
        System.out.print("Color: ");
        String carClr = sc.nextLine();
        System.out.print("Year: ");
        int carYr = sc.nextInt();
        System.out.print("Number of doors: ");
        int carDoors = sc.nextInt();
        sc.nextLine(); // consume newline

        Car car = new Car(carMdl, carClr, carYr, carDoors);

        // Bicycle input
        System.out.println("\nEnter Bicycle details:");
        System.out.print("Model: ");
        String bikeMdl = sc.nextLine();
        System.out.print("Color: ");
        String bikeClr = sc.nextLine();
        System.out.print("Year: ");
        int bikeYr = sc.nextInt();
        System.out.print("Has gear (true/false): ");
        boolean bikeGear = sc.nextBoolean();
        sc.nextLine(); // consume newline

        Bicycle bike = new Bicycle(bikeMdl, bikeClr, bikeYr, bikeGear);

        // Scooter input
        System.out.println("\nEnter Scooter details:");
        System.out.print("Model: ");
        String scooterMdl = sc.nextLine();
        System.out.print("Color: ");
        String scooterClr = sc.nextLine();
        System.out.print("Year: ");
        int scooterYr = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Engine Type: ");
        String scooterEngType = sc.nextLine();

        Scooter scooter = new Scooter(scooterMdl, scooterClr, scooterYr, scooterEngType);

        // Display all vehicle details
        System.out.println("\nCar Details:");
        car.display();
        
        System.out.println("\nBicycle Details:");
        bike.display();
        
        System.out.println("\nScooter Details:");
        scooter.display();

        sc.close();
    }
}
