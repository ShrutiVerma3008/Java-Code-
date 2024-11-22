import java.util.Scanner;
class performance{
    int sum(int n,int m,int p){
        return n+m+p;
    }
    int ave(int n,int m,int p){
        return n+p+m/3;
    }
    int pro(int n,int m,int p){
        return n*m*p;
    }
    void smaller(int n,int m,int p){
        int small = n;
        if (small<m && small<p){
            System.out.println("the samllest is "+ small);
        }
        else if (small>m && m<p){
            small= m;
            System.out.println("the samllest is "+ small);
        }
        else{
            small= p;
            System.out.println("the samllest is "+small);
        }
            
        }
    }



public class lab1_q2 {
    public static void main(String[] args) {
        //input 
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n= sc.nextInt();
        System.out.println("enter the number : ");
        int m= sc.nextInt();
        System.out.println("enter the number : ");
        int p= sc.nextInt();
//object creation
        performance ch = new performance();
        System.out.println("sum "+ ch.sum(n,m,p));
        System.out.println("average : "+ch.ave(n,m,p));
        System.out.println("product : " +ch.pro(n,m,p));
        ch.smaller(n,m,p);


    }
    
}
