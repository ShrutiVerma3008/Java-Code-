import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Deserial {

    public static void main(String args[]){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("s1.txt");
            ois = new ObjectInputStream(fis);
            Person p1 = (Person)ois.readObject();
            System.out.println("Age  :"+p1.age); 
            System.out.println("weight   :"+p1.weight); 
            System.out.println("Height  :"+p1.height); 
            System.out.println("Name  :"+p1.name); 
            System.out.println("pid :"+p1.pid); 
            System.out.println("adha  :"+p1.adha);
        }
        catch(IOException ex) 
        { 
         ex.printStackTrace(); 
        } 
        catch(ClassNotFoundException ex) 
        { 
         ex.printStackTrace(); 
        } 
        finally 
        { 
            try 
            { 
              if(ois!=null) 
              { 
               ois.close(); 
               ois =null; 
              } 
            } 
            catch(IOException ex) 
            { 
             ex.printStackTrace(); 
            } 
     
            try 
            { 
              if(fis!=null) 
              { 
               fis.close(); 
               fis =null; 
              } 
            } 
            catch(IOException ex) 
            { 
             ex.printStackTrace(); 
            } 
    }
}
}
