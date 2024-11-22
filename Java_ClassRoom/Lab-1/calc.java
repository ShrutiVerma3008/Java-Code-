import java.util.Scanner;

class arith{
    int sum(int n,int m){
        return n+m;
    }
    int diff(int n,int m){
        return n-m;
    }
    int pro(int n,int m){
        return n*m;
    }
    int divd(int n,int m){
        return n/m;
    }
}


public class calc {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("enter the number : ");
        int m= sc.nextInt();
        arith ch= new arith();
        int sum_res=ch.sum(n,m);
        int diff_res=ch.diff(n,m);
        int pro_res=ch.pro(n,m);
        int divd_res=ch.divd(n,m);
        System.out.println("the sum is " +sum_res);
        System.out.println("the differnce is " +diff_res);
        System.out.println("the product is " +pro_res);
        System.out.println("the division is " +divd_res);
               
    }
    
}
