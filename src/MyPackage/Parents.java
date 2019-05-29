package MyPackage;

public class Parents extends Student {
    public Parents() {
        Student student = new Student("parents");
        System.out.println("Name: " + name);
        System.out.println("Hobby: " + hobby);
        System.out.println("Marks: " + marks);
    }
}
