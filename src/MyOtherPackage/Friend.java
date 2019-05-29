package MyOtherPackage;

import MyPackage.Student;

public class Friend extends Student {
    public Friend() {
        Student student = new Student("friend");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

    }
}
