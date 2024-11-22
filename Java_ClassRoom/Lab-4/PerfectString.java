import java.util.Scanner;

class String_Check{
    String str;
    int arr[] = new int [26];

    String_Check(String str){
        super();
        this.str = str;
    }

    String perfect_string(String str){
    for(int i=0;i<str.length();i++){
        arr[str.charAt(i)-97]++;
    }
    for(int i=0;i<=25;i++){
        if(arr[i]>1){
            return "Not Perfect String";
        }
    }
    return "Perfect String";
}
}

public class PerfectString {

    public static void main(String [] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter string: ");
    String str = input.nextLine();

    String_Check output = new String_Check(str);

    System.out.println(output.perfect_string(str)); 
    }
}
