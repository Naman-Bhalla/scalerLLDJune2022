package constructorchaining;

public class B extends A {
    private int c;

    public B() {
        super("Naman");
        this.a = 12;
//        super()
        this.c = 3;
//        this.b = 13; // error
        System.out.println("Constructor of B");
    }
}
