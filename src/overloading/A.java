package overloading;

public class A {

    public void print() { // print()
        System.out.println("Hello World");
    }

    public void print(String name) {  // print(String)
        System.out.println("Hello " + name);

        // print(int, string)
        // print(String, int)
    }

//    public String print(String name) { // print(String)
//        System.out.println("Hello from String return type " + name);
//        return name;
//    }
}
