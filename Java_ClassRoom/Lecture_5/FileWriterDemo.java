import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String [] args){
        File f1=null;
        FileWriter fw = null; //Char text
        long length = 0;
        try{
            f1 = new File("C:\\Users\\hp\\Desktop\\java-practice\\All lecture\\Lecture 5\\name");
            fw = new FileWriter(f1);
            fw.write("Hello how are you.This is my first writing in file.");
            length = f1.length();
            System.out.println("Before close length: "+ length);
        } 
        catch(IOException ref){
            ref.printStackTrace();
        }
        finally{
            try{
                if(fw!=null){
                    fw.flush();
                    fw.close();
                    fw = null;
                }
            }
            catch(IOException ref){
                    ref.printStackTrace();
            }
        }
        System.out.println("After close length: "+ f1.length());
    }
    
}
