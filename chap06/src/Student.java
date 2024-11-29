public class Student extends Person {
    int id;

    Student(String name, int id){
        super(name);
        this.id=id;
    }
    void introduce(){
        super.intrduce();
        System.out.println("학생 번호 :" +id);
    }
}
