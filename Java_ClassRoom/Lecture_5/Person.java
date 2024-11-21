import java.io.Serializable;

public class Person implements Serializable  //Marker Interface
{
    String name;
    int age;
    float weight;
    double height;
    static int pid;
    transient int adha;
}