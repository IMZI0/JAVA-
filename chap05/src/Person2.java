public class Person2 {
    private String name;
    private int age;

    public Person2 setName(String name) {
        this.name = name;
        return this;
    }

    public Person2 setAge(int age) {
        this.age = age;
        return this;
    }

    public void Hello() {
        System.out.println("안녕 나는 " + name + "이고 " + age + "살이야");
    }

    public static void main(String[] args) {
        Person2 person = new Person2();
        System.out.println(person.setName("민규"));
        person.setAge(18);
        //person.setName("규리").setAge(25).Hello();
        person.Hello();
    }
}
