
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial{
    public static void main(String args []){
        Person p1 = new Person(); 
        p1.age=24; 
        p1.weight=56.7f; 
        p1.height=5.11; 
        p1.name="demo"; 
        p1.pid=45555; 
        p1.adha=411; 
        FileOutputStream fos =null; 
        ObjectOutputStream oos =null; 
    try{
        fos = new FileOutputStream("s1.txt");
        oos = new ObjectOutputStream(fos);
        oos.writeObject(p1); 
    }
    catch(IOException ex){
        ex.printStackTrace();
    }
    finally{
        try{
            if(oos!=null){
                oos.flush();
                oos.close();
                oos = null;
            }
        }
        catch(IOException ref){
            ref.printStackTrace();
        }
        try 
        { 
         if(fos!=null) 
         { 
          fos.flush(); 
          fos.close(); 
          fos =null; 
         } 
        } 
        catch(IOException ex) 
        { 
         ex.printStackTrace(); 
        }
    }
}
}