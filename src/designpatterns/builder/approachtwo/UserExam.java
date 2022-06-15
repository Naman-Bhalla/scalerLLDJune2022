package designpatterns.builder.approachtwo;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    private UserExam() {}



    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {
        private int englishMarks = 35;
        private int mathsMarks = 12;
        private int scienceMarks;
        private String name = "EMPTY";

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build() {
            // Step 1: Validate the attributes
            if (englishMarks > 100 || scienceMarks > 100 || mathsMarks > 100) {
                throw new InvalidParameterException("Marks can't be greater than 100");
            }

            if (mathsMarks + englishMarks > 150) {
                throw new InvalidParameterException("Maths + English can't be greater than 150");
            }

            if (name.startsWith("0")) {
                throw new InvalidParameterException("Name can't start with 0");
            }

            //  Step 2: Create parent
            UserExam userExam = new UserExam();
            userExam.englishMarks = this.englishMarks;
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;

            return userExam;
        }
    }

}

// A static class only means that you can access this class
// without creating an object of user Exam