package overriding;

public class B extends A{

//    void doSomething() {
//        System.out.println("I am A");
//    }


    @Override
    void doSomething() {
        System.out.println("I am B");
        super.doSomething();
//        this.doSomething();
    }
}
