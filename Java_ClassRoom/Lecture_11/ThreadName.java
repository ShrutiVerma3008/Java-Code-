class Test1 extends Thread // 1st Child Thread
{
    public void run() //2
    {
        Thread.currentThread().setName("Even Thread");
        for (int i = 0; i < 1000; i += 2) {
            if(i==400){
                stop();
            }
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(getName() + ": " + i);
        }
    }
}

class Sample extends Thread // 2nd Child Thread
{
    public void run() {
        Thread.currentThread().setName("Odd Thread");
        for (int i = 1; i < 1000; i += 2){
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(getName() + ": " + i);
        }
    }
}
public class ThreadName {
    public static void main(String[] args) {
        Test1 T1 = new Test1(); //3
        T1.start(); //4 Main -> Thread
        Sample S1 = new Sample();
        S1.start();
    }
}