public class Person {
    private String firstName;
    private String lastName;

    public Person(String first, String second){
        this.firstName = first;
        this.lastName = second;
    }

    public void doSomething(){
        System.out.println("I am watching Netflix");
    }

    public String toString(){
        return  this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
