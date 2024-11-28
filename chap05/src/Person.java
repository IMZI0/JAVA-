public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        Person person = new Person("지영");

        System.out.println("이름 : "+person.getName());
        person.setName("민지영");
        System.out.println("변경한 이름 : "+person.getName());
    }
}
