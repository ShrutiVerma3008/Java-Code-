class Q{
    boolean b = true;
    public synchronized void put(int n){
        while(!b){
            try{
                wait();
            }
            catch(InterruptedException ref){
                ref.printStackTrace();
            }
        }
        b = false;
        notify();
        System.out.println(Thread.currentThread().getName()+ " : " + n);
        
    }

    public synchronized void get(int n){
        while(b){
            try{
                wait();
            }
            catch(InterruptedException ref){
                ref.printStackTrace();
            }
        }
        b = true;
        notify();
        System.out.println(Thread.currentThread().getName()+ " : " + n);
        
    }
}

class Producer extends Thread{
    Q q = null;
    Producer(Q q){
        super();
        this.q = q;
    }
    int num = 0;
    public void run(){
        while(true){
            q.put(num++);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ref){
                ref.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread{
    Q q = null;
    Consumer(Q q){
        super();
        this.q = q;
    }
    int num = 0;
    public void run(){
        while(true){
            q.get(num++);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ref){
                ref.printStackTrace();
            }
        }
    }

}

public class ProducerConsumer {
    public static void main(String args[]){
        Q q = new Q();
        new Producer(q).start();
        new Consumer(q).start();
    }
}

