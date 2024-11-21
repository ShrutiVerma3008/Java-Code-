interface Iface<K>{
    K getFirst();
    K getLast();
}

class Test<K> implements  Iface<K>{
    K k[];
    
    public Test(K k[]){
        this.k = k;
    }
    
    public K getFirst(){
        return k[0];
    }

    public K getLast(){
        return k[k.length-1];
    }
}

public class GenericInterface{
    public static void main(String[] args) {

        Integer all[] = {1,2,3,4,6};
        Test<Integer> t = new Test<Integer>(all);
        System.out.println(t.getFirst());
        System.out.println(t.getLast());

        Float all1[] = {1.5f,2.5f,3.7f,4.8f,6.9f};
        Test<Float> f = new Test<Float>(all1);
        System.out.println(f.getFirst());
        System.out.println(f.getLast());  
    }
}