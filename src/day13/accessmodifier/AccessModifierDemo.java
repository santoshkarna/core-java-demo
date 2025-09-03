package day13.accessmodifier;

public class AccessModifierDemo {

    private String privateVar = "this is private variable";
    String defaultVar = "this is default variable";
    protected String protectedVar = "this is protected variable";
    public String publicVar = "this is public variable";

    private void privateMethod() {
        System.out.println("this is private method");
    }

    void defaultMethod() {
        System.out.println("this is default method");
    }

    protected void protectedMethod() {
        System.out.println("this is protected method");
    }

    public void publicMethod() {
        System.out.println("this is public method");
    }

    public AccessModifierDemo() {
        System.out.println("this is public access constructor.");
    }

    AccessModifierDemo (int a){
        System.out.println("this is default access constructor.");
    }

    protected AccessModifierDemo (int a, String b){
        System.out.println("this is protected access constructor.");
    }

    private AccessModifierDemo (String s){
        System.out.println("this is private access constructor.");
    }

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo("hello");
        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
        demo.privateMethod();
    }
}
