class Figure{
    double r;
    double a;
    double v;

    Figure(double r, double a, double v){
        this.r = r;
        this.a = a;
        this.v = v;
    }
    public void dispArea(){
        System.out.println(a);
    }
    public void dispVolume(){
        System.out.println(v);
    }
}

class Cone extends Figure{
    double p;
    double s;

    Cone(double r, double p, double s, double a, double v){
        super(r,a,v);
        this.p = p;
        this.s = s;
    }
    public void calcArea(){
        System.out.println((p*r*s)+(p*r*s));
    }

    public void calcVolume(){
        System.out.println((p*r*s)/3);
    }
}

public class inheritance_demo{
    public static void main(String [] args){
        Cone c1 = new Cone(5.0,7.0,6.0,3.14, 62.0);
        c1.calcArea();
        c1.calcVolume();
        c1.dispArea();
    }
}