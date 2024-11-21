import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F1toF2R {
    public static void main(String args []){
    File f1 = null;
    File f2 = null;
    FileReader fr = null;
    FileWriter fw = null;
    FileWriter fw1 = null;
    try{
        f1 = new File("Sample.txt");
        fw = new FileWriter(f1);
        fw.write("Java");
        System.out.println(f1.length());
    }
    catch(IOException ref){
        ref.printStackTrace();
    }
    finally{
        try{
        if(fw!=null){
            fw.flush();
            System.out.println(f1.length());
            fw.close();
        }
        }
        catch(IOException ref){
            ref.printStackTrace();
        }
    }

    try{
        f2 = new File("Duplicate.txt");
        fr = new FileReader(f1);
        fw1 = new FileWriter(f2);
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
            fw1.write(ch);
        }
    }
    catch(IOException ref){
        ref.printStackTrace();
    }
    finally{
        try{
            if(fw1!=null){
                fw1.flush();
                fw1.close();
            }
            if(fr!=null){
                fr.close();
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
}