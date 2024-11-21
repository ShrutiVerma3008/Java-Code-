class Person extends Object{
    int age;
    float weight;
    double height;
     public Person(int age, float weight, double height){
        super();
        this.age = age;
        this.weight = weight;
        this.height = height;
     }


    public String toString(){
        return "Age " + age + " Weight " + weight + "Height " + height;
    }

    public boolean equals(Object obj){
        Person p2 = (Person)obj;
        if((this.age==p2.age)&&(this.weight==p2.weight)&&(this.height==p2.height)){
            return true;
        }
        else{
            return false;
        }
    }

    public int hashCode(){
   
        String strAge = String.valueOf(age);
        String strWeight = String.valueOf(weight);
        String strHeight = String.valueOf(height);

        //FINDOUT THE HASHCODE
        int hash = 0;
        int hashAge = strAge.hashCode();
        int hashWeight = strWeight.hashCode();
        int hashHeight = strHeight.hashCode();
        //Sum of all the hashcode
        hash = hash + hashAge + hashWeight + hashHeight;
        return hash;
    }

}

public class PersonMangaerObjectClass {

    public static void main (String [] args){
        int i = 10;
        int j = 10;
        System.out.println(i);
        System.out.println(j);
        System.out.println(i==j);

        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1==s2); //address false
        System.out.println(s1.equals(s2));  //content true

        Person p1 = new Person(23, 57.6f, 5.6);
        Person p2 = new Person(23, 57.6f, 5.6);

        System.out.println(s1);
        System.out.println(p1);//hashcode now it will not print hashcode as i have overriden this.

        System.out.println(p1.equals(p2));// false but now it will give true as i have overriden the equals method

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
    
}
