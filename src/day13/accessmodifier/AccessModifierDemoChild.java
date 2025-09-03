package day13.accessmodifier;

public class AccessModifierDemoChild extends AccessModifierDemo {
    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo(5,"hello");
        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
//        demo.privateMethod();
    }
}
