package people;

public class Student extends Person{
    private int credits;
    public Student (String name, String street) {
        super(name, street);
        this.credits = 0;
    }
    public int getCredits() {
        return credits;
    }
    public void study(){
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   " +  this.credits;
    }
}
