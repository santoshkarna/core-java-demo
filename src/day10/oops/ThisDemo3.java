package day10.oops;

public class ThisDemo3 {

    public void sayHello() {
        System.out.println("Hello, ");
    }

    public void greet() {
        System.out.println("this: " + this);
        this.sayHello();
//        sayHello();
        System.out.println("Good Morning");
    }

    public static void main(String[] args) {
        ThisDemo3 obj = new ThisDemo3();
        System.out.println("obj: " + obj);
//        obj.sayHello();
        obj.greet();
    }
}
