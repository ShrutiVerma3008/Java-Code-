package lab.Lab-9;

class MyThread extends Thread 
{
    // Override 
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread: " + i);
            try 
            {
                Thread.sleep(500);  
            }
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadTest 
{
    public static void main(String[] args) 
    {
        MyThread myThread = new MyThread();

        myThread.start();

        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Main Thread: " + i);
            try 
            {
                Thread.sleep(500);  // Sleep for 500 milliseconds
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}
