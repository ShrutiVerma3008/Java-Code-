package lab.Lab 5;

public class Student 
{
    private String name;

    public void inputName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public String average(int mark1, int mark2, int mark3) 
    {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        
        if (average > 50) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
}


public class StudentTest 
{
    public static void main(String[] args) 
    {
        Student student1 = new Student();
        Student student2 = new Student();

        // Input names for students
        student1.inputName("John Doe");
        student2.inputName("Jane Smith");

        // Display names
        System.out.println("Student 1: " + student1.getName());
        System.out.println("Student 2: " + student2.getName());

        // Calculate average and determine pass or fail
        System.out.println("Student 1 Result: " + student1.average(60, 70, 80));
        System.out.println("Student 2 Result: " + student2.average(40, 45, 50));
    }
}

