class Test extends Thread{
    int total = 0;

    public void run(){
        for(int i=0;i<=10;i++){
            total = total + i;
        }
        notify();
    }
}

public class InterThreadCommunciation {
    public static void main(String args[]){
        Test t = new Test();
        t.start();
        try{
            synchronized(t){
                    t.wait();  // t- child lock
                }
            }
        catch(InterruptedException ref){
            ref.printStackTrace();
        }
        System.out.println(t.total);
    }
}
