class Prod {
    int id;
    String nm;

    Prod(int i, String n){
        id =i;
        nm=n;
    }

    void info(){
        System.out.println(id +" : "+nm);
    }
}

class ExtProd extends Prod{
    int qty;

    ExtProd(int i, String n, int q){
        super(i,n);
        qty=q;
    }

    @Override
    public void info() {
        System.out.println(id+ ": " + nm+ "의 개수는 " +qty);
    }
}


public class ProdTest {
    public static void main(String[] args) {
        Prod p = new Prod(1,"pen");
        ExtProd ep = new ExtProd(2,"notebook",10);

        p.info();
        ep.info();
    }

}
