package MyPackage;

public class Student {
    public String name = "Paul Brown";
    private int passport = 123456;
    protected String marks = "5, 4, 5, 5";
    String hobby = "Bowling";

    public Student() {

    }

    public Student(String whoCalls){
        System.out.println("\nThe information for " + whoCalls + ":");
    }

    public void showStudentProfile() {
        System.out.println("\nStudent's profile:");
        System.out.println("Name: " + name);
        System.out.println("Hobby: " + hobby);
        System.out.println("Marks: " + marks);
        System.out.println("Passport: " + passport);
    }
}

