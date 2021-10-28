public class NinthGrader extends Student{ // SOME CODE NEEDED IN THIS LINE
    // YOUR CODE HERE
    public NinthGrader(String a, String b){
        super(a, b, 2025);

    }
    public NinthGrader(){
        super("null", "null", 2025);
    }
    @Override
    public void doSomething() {
        System.out.println("I'm studying for a Harkness Discussion!");
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() + " (Ninth Grader)";
    }



}
