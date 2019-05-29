import MyOtherPackage.Friend;
import MyOtherPackage.Stranger;
import MyPackage.Parents;
import MyPackage.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.showStudentProfile();
        Parents parents = new Parents();
        Friend friend = new Friend();
        Stranger stranger = new Stranger();
    }
}
