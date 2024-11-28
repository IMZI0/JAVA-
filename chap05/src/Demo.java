public class Demo {

    int field;

    public void showDiff(){
        int local = 7;

        field = local;

        System.out.println("클래스 필드 :" + field);
        System.out.println("메서드 지역변수 :" + local);
    }

    public  void changField(){
        field = 10;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.showDiff();
        demo.changField();

        System.out.println("변경한 클래스 필드 :" +demo.field);
    }
}


