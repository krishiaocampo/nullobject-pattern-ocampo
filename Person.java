public class Person {
    String name;
    int age;
    String address;

    Person(String name, int age, String address) {
        this.name = (name == null) ? "No name" : name;
        this.age = (age == 0) ? 69 : age;
        this.address = (address == null) ? "No Address" : address;
    }

}
 