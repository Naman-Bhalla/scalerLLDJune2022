package designpatterns.builder.approachone;

import inheritance.User;

public class Client {

    public static void main(String[] args) {
        UserExamParameters parameters = new UserExamParameters();
        parameters.englishMarks = 120;
        parameters.name = "Naman";

        UserExam userExam;
        try {
            userExam = new UserExam(parameters);
        } catch (Exception exception) {
            System.out.println("Some parameters are wrong");
        }


//        UserExam userExam1 = new UserExam();
//        userExam1.setName("Rohan");

    }
}
