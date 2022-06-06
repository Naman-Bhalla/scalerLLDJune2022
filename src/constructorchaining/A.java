package constructorchaining;

public class A {
    int a;
    private int b;

    public A() {
        System.out.println("Constructor of A");
        this.a = 1;
        this.b = 2;
    }
    public A(String name) {
        System.out.println("Constructor of A " + name);
    }
}
