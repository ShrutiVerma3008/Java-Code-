import java.util.Scanner;

public class count_letters {

    public static void main(String [] args){
        int arr[] = new int [26];

    Scanner input = new Scanner(System.in);
    String pass = input.nextLine().toUpperCase();  // Convert the input to uppercase to handle both cases


    for(int i=0;i<pass.length();i++){
        arr[pass.charAt(i)-65]++;
    }
    for(int i=0;i<pass.length();i++){
        if(arr[i]>1){
            System.out.println((char)('A'+i));
        };
    }
    }    
}
