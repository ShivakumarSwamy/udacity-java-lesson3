package inheritanceExample;

public class PersonTester {

    public static void main(String[] args) {
        var sally = new Person("Sally", "Phillips");
        System.out.println(sally);

        var mike = new Student("Mike", "Thompson", "12345");
        System.out.println(mike);

        var jeff = new StudentEmployee("Jeff", "Sam", "4567", "#12345", 20.5);
        System.out.println(jeff);
    }
}
