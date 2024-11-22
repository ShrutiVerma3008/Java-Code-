class X{
    int i;
    int j;

    X(int i, int j){
        this.i = i;
        this.j = j;
    }

    int FinalSum(){
        return i+j; 
    }
}

class Y extends X{
    Y(int i, int j){
        super(i, j);
    }

    int Product(){
        return i*j;
    }
}

class Z extends Y{
    Z(int i, int j){
        super(i, j);
    }

    float Difference(){
        return i-j;
    }
}

public class Multilevel_inheritance {
    public static void main(String [] args){
        Z z1 = new Z(4,5);

        System.out.println("Difference: "+z1.Difference());
        System.out.println("Sum: " + z1.FinalSum());
        System.out.println("Product: " + z1.Product());
    }   
}
