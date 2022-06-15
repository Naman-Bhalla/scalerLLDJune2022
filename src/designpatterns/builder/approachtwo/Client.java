package designpatterns.builder.approachtwo;

public class Client {

    public static void main(String[] args) {

        UserExam userExam;
        try {
            userExam = UserExam.getBuilder()
                            .setName("Naman")
                            .setMathsMarks(10)
                            .setEnglishMarks(50)
                            .build();

            UserExam userExam1 = UserExam.getBuilder().build();
            System.out.println("Wait");

//            userExam = userExamBuilder.build();

            // UserExam userExam = UserExam.getBuilder()
            //         .setEnglishMarks(12)
            //         .setMathsMarks(40)
            //         .build();

            // Method Chaining
        } catch (Exception exception) {
            System.out.println("Some parameters are wrong");
        }


//        UserExam userExam1 = new UserExam();
//        userExam1.setName("Rohan");

    }
}
