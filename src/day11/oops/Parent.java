package day11.oops;

public class Parent {

    public Parent() {
        System.out.println("Parent's default constructor");
    }

    public Parent(String name) {
        System.out.println("Parent's parameterized constructor");
    }

    //hidden variable
     String name ="parent's name";

     //overridden methods
    public void greet() {
        System.out.println("Hello, good morning from parent!!!");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.getClass().getName());
        System.out.println(p);
        System.out.println(p.toString());
    }
}

//not inherited
//private members
//hidden variables
//overridden methods
