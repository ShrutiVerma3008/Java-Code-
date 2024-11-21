import java.io.File;
//import java.io.FileException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterR {
    public static void main(String args[]){
        File f1 = null;
        FileWriter fw = null;

        try{
            f1 = new File("Sample.txt");
            fw = new FileWriter(f1);

            fw.write("Hello Hi BYE");
            System.out.println("length: "+ f1.length());
        }

        catch (IOException ref){
            ref.printStackTrace();
        }
        finally{
            try{
                if(fw!=null){
                    fw.flush();
                    fw.close();
                    fw = null;
                    System.out.println("length: "+ f1.length());
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
