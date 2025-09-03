package day11.oops;

public class ParentTest {

    public static void main(String[] args) {
//        Parent parent = new Parent();
//        System.out.println(parent.name);
//        parent.greet();

        Child child1 = new Child();
//        System.out.println(child1.name);
        child1.greet();

        System.out.println("============");
        Child child2 = new Child("hello");
        child2.greet();
    }
}
