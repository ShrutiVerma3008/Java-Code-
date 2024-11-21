class Shared extends Thread{
    public synchronized void set(){
        for(int i=0;i<100;i+=2){
            if(i==10 && Thread.currentThread().getName().equals("Thread-1")){
                stop(); //Lock release
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ref){
                ref.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" : "+ i);
        }
    }
}

class MyThread1 extends Thread{
    Shared s1 = null;
    
    MyThread1(Shared s1){
        this.s1 = s1;
    }
    public void run(){
        s1.set();
    }
}

class MyThread2 extends Thread{
    Shared s1 = null;
    MyThread2(Shared s1){
        this.s1 = s1;
    }
    public void run(){
        s1.set();
    }
}

public class SynchronizedThreading{
    public static void main(String args[]){
        Shared s = new Shared();
        MyThread1 t1 = new MyThread1(s);
        System.out.println(t1);
        MyThread2 t2 = new MyThread2(s);
       // t2.setPriority(Thread.MAX_PRIORITY-3);
        System.out.println(t2);
        t1.start();
        t2.start();
    }
}