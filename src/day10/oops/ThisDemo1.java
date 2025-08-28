package day10.oops;

//shadowing: is the process of hiding instance variable by local variable with same name
//in non-static method/constructor of a class

//'this' is a keyword and is an implicit reference variable of current object of a current class
// and is available inside non-static method
//and constructor of a class. we can not change the value of this.
public class ThisDemo1 {

    //instance variable
    int a = 5;

    //non-static method
    public void display() {
        System.out.println("this is: " + this);
        System.out.println(a);//this.a
        System.out.println(this.a);
        //local variable
        int a = 6;
        System.out.println(a);
//        ThisDemo1 obj = new ThisDemo1();
//        int sum = a + obj.a;
        int sum = a + this.a;
        System.out.println("sum = " + sum);
    }

    public static void greet() {
        ThisDemo1 obj = new ThisDemo1();
        System.out.println(obj.a);
//        System.out.println(this.a);
        int a = 7;
    }

    public static void main(String[] args) {
        ThisDemo1 obj1 = new ThisDemo1();
        System.out.println("obj1 = " + obj1);
        obj1.display();

        System.out.println("============");
        ThisDemo1 obj2 = new ThisDemo1();
        System.out.println("obj2 = " + obj2);
        obj2.display();
    }
}
