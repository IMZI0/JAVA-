public class Cls {
    double radius;

    public Cls(double r){
        radius = r;
    }

    double getVolume(){
        return 4.0/3.0*Math.PI+Math.pow(radius,3);

    }

    double getArea(){
        return 4*Math.PI*radius*radius;

    }

    public static void main(String[] args) {
        Cls ball = new Cls(2.0); //객채 생성
        System.out.println("부피: "+ball.getVolume());
        System.out.println("표면적 : "+ball.getArea());
    }
}
