package day13.other;

import day13.accessmodifier.AccessModifierDemo;

public class AccessModifierDemoChild extends AccessModifierDemo {
    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo( );
        demo.publicMethod();
//        demo.protectedMethod();
//        demo.defaultMethod();
//        demo.privateMethod();

        AccessModifierDemoChild child = new AccessModifierDemoChild();
        child.protectedMethod();
    }
}
