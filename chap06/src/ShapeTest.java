import java.awt.event.WindowFocusListener;

class Circle{
    double r;

    Circle(double r){
        this.r= r;

    }
    double getRadius(){
        return r;
    }

    double area(){
        return Math.PI*r*r;
    }
}

class Sphere extends Circle{
    public Sphere(double r){
        super(r);
    }
    double vol(){
        return (4.0/3.0) *Math.pow(r,3);
    }

    double scrArea(){
        return  4*super.area();
    }

    void info(){
        System.out.println("반지름 " +getRadius()+"부피 "+vol());
        System.out.println("반지름 "+getRadius()+"표면적 "+scrArea());
    }
}


public class ShapeTest {
    public static void main(String[] args) {
        Sphere s = new Sphere(10.0);
        s.info();
    }
}
