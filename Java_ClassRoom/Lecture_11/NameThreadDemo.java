class Computer extends Thread{
    public Computer(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}

class AI extends Thread{
    public AI(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}

public class NameThreadDemo {
    public static void main(String[] args) {
        Computer c = new Computer("AI&DS");
        AI a = new AI("DS");
        c.start();   
        a.start();
    }
}
