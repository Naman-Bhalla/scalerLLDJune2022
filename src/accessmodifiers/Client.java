package accessmodifiers;

public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "naman";
//        student.address = "hello"; will not work
        student.email = "naman@scaler.com";

        accessmodifiers.packageone.Student newStudent = new accessmodifiers.packageone.Student();
//        newStudent.name = "Naman";
    }
}
