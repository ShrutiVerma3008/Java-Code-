package lab.Lab-7;

public class Teacher {
    protected String tname;
    protected int tage;
    protected String tsubject;

    public Teacher(String tname, int tage, String tsubject) 
    {
        this.tname = tname;
        this.tage = tage;
        this.tsubject = tsubject;
    }

    public void displayTeacher() 
    {
        System.out.println("Teacher Name: " + tname);
        System.out.println("Teacher Age: " + tage);
        System.out.println("Subject: " + tsubject);
    }
}
public class Student extends Teacher 
{
    private String sname;
    private int sage;
    private int grade;

    public Student(String tname, int tage, String tsubject, String sname, int sage, int grade) 
    {
        super(tname, tage, tsubject);
        this.sname = sname;
        this.sage = sage;
        this.grade = grade;
    }

    public void displayStudent() 
    {
        System.out.println("Student Name: " + sname);
        System.out.println("Student Age: " + sage);
        System.out.println("Grade: " + grade);
    }
}
public class SchoolTest
 {
    public static void main(String[] args)
     {
        Teacher teacher = new Teacher("Mr. John", 40, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayTeacher();

        System.out.println();

        Student student = new Student("Mr. John", 40, "Mathematics", "Alice", 15, 10);
        System.out.println("Student Details:");
        student.displayStudent();
    }
}
