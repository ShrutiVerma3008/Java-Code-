
class MyRun implements Runnable{
    private String name;
    public MyRun(String name){
        this.name = name;
    }
    public void run(){
        Thread.currentThread().setName(name);
        for(int i=0;i<100;i+=2){
            System.out.println(Thread.currentThread().getName()+ " : " + i);
        }
    }
}

public class MyRunnableManager {
    public static void main(String [] args){
        MyRun my = new MyRun("Child");
        Thread t1 = new Thread(my);
        t1.start();
        Thread.currentThread().setName("Main");
        for(int i=0;i<100;i+=2){
            System.out.println(Thread.currentThread().getName()+ " : " + i);
        }
    }
    
}
