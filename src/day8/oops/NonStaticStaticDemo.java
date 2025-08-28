package day8.oops;

public class NonStaticStaticDemo {
    //non-static(instance) variable
    int a = 5;

    //static variable(class level variable)
    static int b = 6;

    //non-static method(object's behavior)
    public void sayHello() {
        System.out.println("Hello!");
    }

    //static method(class level behavior)
    public static void sayHi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        NonStaticStaticDemo ob = new NonStaticStaticDemo();
        System.out.println(ob.a);
        ob.sayHello();

        System.out.println(b);
        sayHi();

        //best approach
        System.out.println(NonStaticStaticDemo.b);
        NonStaticStaticDemo.sayHi();

    }
}
