package day10.oops;

public class ThisDemo2 {

    String name;
    int age;

//    public ThisDemo2(String n, int a) {
//        name = n;
//        age = a;
//    }

//    public ThisDemo2(String name, int age) {
//        name = name;
//        age = age;
//    }

    //best
    public ThisDemo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public ThisDemo2(String name, int age) {
//        name = this.name;
//        age = this.age;
//    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ThisDemo2 obj = new ThisDemo2("John Doe", 20);
        obj.displayInfo();
    }
}
