
class Test1 extends Thread // 1 Child Thread
{
    public void run() //2
    {
        for(int i = 0; i < 1000; i+=2)
            System.out.println(getName()+": "+i);
    }
}

public class MultiThredingDemo {
    public static void main(String[] args) {
        Test1 T1 = new Test1(); //3
        T1.start(); //4 Main -> Thread
        for(int j = 1; j<1000; j+=2)
            System.out.println(Thread.currentThread().getName()+": "+j);
    }
}