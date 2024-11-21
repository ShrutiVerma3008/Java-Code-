class Test<X>{
    X x;
    Test(X x){
        this.x = x;
    }
    X get(){
        return x;
    }
}

public class GenericStringDemo {
    public static void main(String[] args) {

        Test<Object> t1 = new Test<Object>("ABC");
        String s1 = (String)t1.get();
        System.out.println(s1);

        Test<Object> t2 = new Test<Object>(2);
        Integer i1 = (Integer)t2.get();
        System.out.println(i1);
    }
}
