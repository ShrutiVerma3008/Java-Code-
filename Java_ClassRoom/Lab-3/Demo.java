abstract class Figure{
    double pi = 3.1420;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();
}

class Cone extends Figure{
    double n;
    double s;
    double area;
    double volume;

    Cone(double n, double s){
        this.n=n;
        this.s=s;
    }

    public void calcArea(){
        area = pi*n*(n+s);
    }
    public void calcVol(){
        volume = (pi*n*n*s)/3.0;
    }
    public void DispArea(){
        System.out.println(area);
    }
    public void Dispvol(){
        System.out.println(volume);
    }
}

class Sphere extends Figure{
    double r;
    double area;
    double volume;
    
    Sphere(double r){
        this.r=r;
    }

    public void calcArea(){
        area = 4*pi*(r*r);
    }
    public void calcVol(){
        volume = (4/3)*pi*(r*r*r);
    }
    public void DispArea(){
        System.out.println(area);
    }
    public void Dispvol(){
        System.out.println(volume);
    }

}

class Cylinder extends Figure{

    double h;
    double r;
    double area;
    double volume;
    
    Cylinder(double r, double h){
        this.r=r;
        this.h=h;
    }

    public void calcArea(){
        area = 2*pi*r*h + 2*pi*r*r;
    }
    public void calcVol(){
        volume = pi*r*r*h;
    }
    public void DispArea(){
        System.out.println(area);
    }
    public void Dispvol(){
        System.out.println(volume);
    }
}

public class Demo{
    public static void main(String [] args){
        Cone c1 = new Cone(4, 6);
        c1.calcArea();
        c1.calcVol();
        c1.DispArea();
        c1.Dispvol();

        Sphere s1 = new Sphere(5);
        s1.calcArea();
        s1.calcVol();
        s1.DispArea();
        s1.Dispvol();

        Cylinder cy1 = new Cylinder(5,6);
        cy1.calcArea();
        cy1.calcVol();
        cy1.Dispvol();
        cy1.DispArea();

    }
    
}
