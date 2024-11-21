import java.io.File;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args){
        try{
            File f1 = new File("Sample.txt");
            System.out.println("Exist: "+f1.exists());
            f1.createNewFile();
            System.out.println("Exist: "+f1.exists());
            
            System.out.println("Name: "+f1.getName());

            System.out.println("Absolute Path: "+f1.getAbsolutePath());

            //System.out.println("Delete: "+f1.delete());

            System.out.println("Length: "+f1.length());

            System.out.println("Exist: "+f1.exists());

            System.out.println("Execute" + f1.canExecute());
            System.out.println("Read" + f1.canRead());
            System.out.println("Write" + f1.canWrite());

            File f3 = new File("A\\B");
            System.out.println(f3.mkdirs());

            File f4  = new File(f3,"sample.png"); 
            f4.createNewFile(); 
            System.out.println(f4.isFile()); 
            System.out.println(f4.isDirectory()); 
            System.out.println(f4.isHidden()); 
            System.out.println("Length :"+f4.length()); 
            
            File f5  = new File("C:\\Users\\hp\\Desktop\\java-practice"); 
            String all[]=  f5.list(); 
            for(String file1  :  all ) 
            { 
             System.out.println(file1); 
            } 
        }

        catch(IOException ref){
            ref.printStackTrace();
        }
    }
}
