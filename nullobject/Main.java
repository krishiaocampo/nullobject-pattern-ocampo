package nullobject;
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(null, 21, null);

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.address);
    }
}