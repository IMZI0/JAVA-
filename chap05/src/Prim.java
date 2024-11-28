class Ball {
    double radius;

    public Ball(double r){
        radius = r;
    }


    public void setRadius(double r){
        radius =r;
    }

}

public class Prim{
    public static void main(String[] args) {
        int a =10;
        int b=a;
        b=20;

        System.out.println("a의값 :"+a);
        System.out.println("b의값 :"+b);

        Ball myBall = new Ball(4.0);
        Ball yourBall =myBall;
        yourBall.setRadius(5.0);

        System.out.println("myBall의 반지름 :"+myBall.radius);
        System.out.println("yourBall의 반지름 :"+yourBall.radius);
    }
}
