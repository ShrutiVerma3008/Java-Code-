class MyRunnable implements Runnable 
{
    private Thread thread;

    // Constructor to create and start the thread
    public MyRunnable() 
    {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {

            System.out.println("MyRunnable: " + i);
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

public class RunnableTest 
{
    public static void main(String[] args) 
    {
        MyRunnable myRunnable = new MyRunnable();

        // Main thread loop
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
