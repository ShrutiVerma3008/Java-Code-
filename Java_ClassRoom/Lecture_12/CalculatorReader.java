class Calculator extends Thread{
    int total = 0;
    
    public void run(){
            for(int i = 0; i <= 10; i++){
                total += i;
            }
            notifyAll(); 
    }
}

class Reader extends Thread{
    Calculator c1 = null;
    
    Reader(Calculator c1){
        this.c1 = c1;
    }

    public void run(){
        try{
            synchronized(c1){ 
                c1.wait();
            }
        }
        catch(InterruptedException ref){
            ref.printStackTrace();
        }
        System.out.println(c1.total); 
    }

}

public class CalculatorReader {
    public static void main(String args []){
        Calculator c1 = new Calculator();
        c1.start(); 
        new Reader(c1).start();
        new Reader(c1).start();
        new Reader(c1).start();
    }
}
