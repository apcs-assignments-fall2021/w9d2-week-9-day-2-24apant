public class PersonClient {
    public static void main(String[] args) {
        // Write some very very basic testing code here
        // Create a Person and then call each of the
        // methods on the Person
        Person bob = new Person("Bob", "Jeff");
        bob.doSomething();
        System.out.println(bob);
        System.out.println(bob.getFirstName());
        System.out.println(bob.getLastName());
        bob.setFirstName("Jeff");
        bob.setLastName("Bob");
        System.out.println(bob);

        Student s = new NinthGrader("Joe", "Smith");
        System.out.println(s);
    }
}