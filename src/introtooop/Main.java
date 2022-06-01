package introtooop;

public class Main {

    public static void main(String[] args) {
        Student karthik = new Student(); // Constructor
        karthik.name = "Karthik";
        karthik.address = "Scalerverse";
        karthik.state = "ACTIVE";
        karthik.pauseCourse();;
        karthik.karthik(); // Method called karthik in student

        Student naman = new Student();
        naman.name = "Naman";
        naman.batch = "Best batch of Scaler";
        naman.karthik();

        System.out.println("Doing Something");
    }
}
