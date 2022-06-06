package polymorphism;

public class TA extends User {
    String expertise;
    String company;

    void takeHelpRequest() {}

    void changeEmail() {
        System.out.println("Changing Email in TA");
    }
}
