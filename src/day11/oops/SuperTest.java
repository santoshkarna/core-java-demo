package day11.oops;

public class SuperTest {

    public static void main(String[] args) {
        //implicit type casting(conversion)
        Super sup = new Sub();
        sup.sayHello();

        //sup.sayHi();
        Sub sub = new Sub();
        sub.sayHi();

//        Sub sub2 = new Super();
//        Super sp = new Super();
//        Sub sub1 = (Sub) sp;//explicit object casting(conversion)
    }
}
