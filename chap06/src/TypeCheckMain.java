
public class TypeCheckMain {
    public static void main(String[] args) {
        Person person = new Person("김철수");
        Student student = new Student("이영희", 123456);

        if (person instanceof Person) {
            System.out.println("person 은 Person 클래스의 인스턴스임");
        }

        if (student instanceof Person) {
            System.out.println("student 은 Person 클래스의 인스턴스임(상속 관계)");
        }
        if (person instanceof Student) {
            Student castedStudent = (Student) person;
            castedStudent.introduce();
        } else {
            System.out.println("person은 student로 변환 불가");
        }
        Person p = student;
        p.intrduce();

        if (p instanceof Student) {
            Student s = (Student) p;
            s.introduce();
        }
    }
}