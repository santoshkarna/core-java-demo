package day12.oops;

//we can not extends final class
public /*final*/ class FinalDemo {
    //final variable must be initialized, and we can not reinitialize
    //so in java final is used to declare constant
    final int a = 4;

    //    final int x;
//
//    public  FinalDemo(int x) {
//        this.x = x;
//    }
//
    //we can not use final keyword on constructor
    public /*final*/ FinalDemo() {
    }

    //we can not override final method
    public /*final*/ void greet() {
        //a = 5;
        System.out.println("good morning");
    }

}
