package constructors;

import javax.management.NotificationFilter;

public class Student {
    int age;
    String name;
    String address = "Scalerverse";
    String email;
    String batch;
    double psp;
    String state;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Student() {}

    Student(Student other) { // Copy Constructor
        name = other.name;
        address = other.address;;
        batch = other.batch;
        email = other.email;
        psp = other.psp;
        state = other.state;
    }

    void changeBatch(String newBatch) {
        this.batch = newBatch;
    }

    void pauseCourse() {
        this.state = "PAUSED";
    }

    void karthik() {
        System.out.println("Karthik");
    }
}
