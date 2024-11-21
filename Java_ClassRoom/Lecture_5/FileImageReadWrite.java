import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 

public class FileImageReadWrite {
   public static void main(String[] args)  
   { 
    FileInputStream fis  =null; 
    FileOutputStream fos  =null; 
    File f1  =null; 
    try 
    { 
     f1  = new File("C:\\College Related\\Programming\\Java oops\\Lecture 5\\photo.jpg");  
  
     fis =  new FileInputStream(f1); 
     long  len  =  f1.length(); 
     byte all[]  =new byte[(int)len]; 
     fis.read(all); 
     fos  =new FileOutputStream("C:\\College Related\\Programming\\Java oops\\Lecture 5\\photo1.jpg"); 
     fos.write(all); 
     /*for(int i=0;i<all.length;i++) 
     { 
      System.out.print(" "+all[i]); 
     } */

      } 
    catch(IOException ex) 
    { 
     ex.printStackTrace(); 
    } 
    finally 
    { 
     try 
     { 
      if(fis!=null) 
      { 
       fis.close(); 
      } 
     } 
     catch(IOException ex) 
     { 
      ex.printStackTrace(); 
     } 
     try 
     { 
        if(fos!=null) 
        { 
         fos.close(); 
         fos  =null; 
        } 
     } 
     catch(IOException ex) 
     { 
      ex.printStackTrace(); 
     } 
    } 
     
   } 
} 
