package day11.oops;

public class Child extends Parent {

    public Child() {
        super("Child");
        System.out.println("Child default constructor");
    }
    public Child(String name) {
//        super();
        System.out.println("Child parameterized constructor");
    }

    //hiding variable
    String name ="child's name";

    //overriding methods
    public void greet() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println("Hello, good morning from child!!!");
        super.greet();
    }
}
