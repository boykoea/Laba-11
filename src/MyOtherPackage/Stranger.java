package MyOtherPackage;

import MyPackage.Student;

public class Stranger {
    public Stranger() {
        Student student = new Student("stranger");
        System.out.println("Name: " + student.name);
    }
}
