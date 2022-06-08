package abstractclasses;

public class Student extends User {
    private String batch;
    private double psp;
    private Mentor mentor;


    Student() {
        super("Student");
    }

    public String getBatch() {
        System.out.println("Someone is trying to access batch");
        return batch;
    }

    @Override
    void saySomething() {

    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }
}
