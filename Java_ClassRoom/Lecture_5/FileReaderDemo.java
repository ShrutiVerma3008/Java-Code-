
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args){
        File f1 = null;
        FileReader fr = null;
        int WordsCount = 0;
        int VowelCount = 0;
        try{
            f1 = new File("C:\\Users\\hp\\Desktop\\java-practice\\All lecture\\Lecture 5\\name");
            fr = new FileReader(f1);
          
          

             long length = f1.length();
             char ch[] = new char[(int) length];

             fr.read(ch);
             for(char c: ch){
                System.out.println(c);
             }

             for(char c: ch){
                if(c ==' '){
                    WordsCount++;
                }
                if(c =='a'|| c == 'e' || c == 'i' || c=='o' || c=='u' || c =='A'|| c == 'E' || c == 'I' || c=='O' || c=='U'){
                    VowelCount++;
                }
             }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }

        System.out.println("Words are: "+ WordsCount);
        System.out.println("Vowels are: "+ VowelCount);
    }
}
