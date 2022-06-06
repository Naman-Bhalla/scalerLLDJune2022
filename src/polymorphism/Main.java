package polymorphism;

import java.util.List;

public class Main {

    public static void changePasswordOfALlUsers(List<User> users) {
        for (User user: users) {
            user.changeEmail();

//            if (user instanceof Student) {
//                System.out.println("I am a student");
//                Student student = (Student) user;
//                student.changeBatch();
////                user.changeBatch();
//            }
        }
    }

    public static void main(String[] args) {
        User user = new TA();
//        user.expertise = "Java"; // Throws Error

        User user1 = new Student();
        User user2 = new Mentor();
        User user3 = new User();

        List<User> users = List.of(
          user1,
          user2,
          user3,
          new Student(),
          new Mentor(),
          user
        );

        changePasswordOfALlUsers(users);


        System.out.println("-------------------------");
        User user7 = new Student();
        user7.changeEmail();
        System.out.println("-------------------------");
    }
}
