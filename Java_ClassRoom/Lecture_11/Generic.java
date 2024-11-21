class A{
    public String toString(){
        return "A";
    }
}

class B {
    public String toString(){
        return "B";
    }
}

class Test<T, X>{
    T t;
    X x;
    Test(T t, X x){
        this.t = t;
        this.x = x;
    }
    void print(){
        System.out.println(t);
        System.out.println(x);
    }
}

public class Generic{
    public static void main(String args[]){
        Test<A, B> t1 = new Test<A, B>(new A(), new B());
        t1.print();

    }
}