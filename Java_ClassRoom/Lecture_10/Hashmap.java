import java.util.HashMap;

class Student{
    int weight;
    String name;
    double height;

    Student(String nam, int w, double h){
        name = nam;
        weight = w;
        height = h; 
    }

    public String toString() {
        return "Student{name='" + name + "' , height = " + height + ", weight=" + weight + "}";
    }
}


class Hashmap{
    public static void main(String args[]){
    Student s1 = new Student("Abhinav", 80, 5.2);
    Student s2 = new Student("Abhi", 85, 6.2);
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("Student1", s1);
    map.put("Student2", s2);
    map.put(null,null);
    System.out.println(map);

    }
}