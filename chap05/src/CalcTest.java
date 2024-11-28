class Calc{
    private  double res;
    static final double PI =3.141592;

    public double area(double rad){
        res = PI *rad*rad;
        return res;
    }

    public static double circ(double rad){
        return 2*rad;
    }
}

public class CalcTest {
    public static void main(String[] args) {
        Calc c = new Calc();
        double a = c.area(10);
        double c2 = Calc.circ(10);

        System.out.println("넓이 " +a);
        System.out.println("둘레 " +c2);
    }
}
