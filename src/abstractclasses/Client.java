package abstractclasses;

public class Client {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
//        instructor.name = "Naman";
        instructor.setName("Naman");
//        instructor.description = "Super cool";
        instructor.setDescription("Super Cool");
        instructor.saySomething();

//        User user = new User();
//        user.name = "Karthik";

        Mentor mentor = new Mentor();
//        mentor.name = "Abhimanyu";
//        mentor.email = "Abvhimanyu@scaler.com";
//        mentor.description = "Boss";

        User user = new Mentor();
        user.changePassword("hello");
    }
}
