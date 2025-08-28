package day8.oops;

public class ObjectDemo {

    public static void main(String[] args) {
        ObjectDemo ob1 = new ObjectDemo();//int a = 5
        System.out.println(ob1);

        ObjectDemo ob2;//int a;
        ob2 = new ObjectDemo();//a = 5
        System.out.println(ob2);

        //anonymous object
        System.out.println( new ObjectDemo());//5

    }
}
//class: is a specification/template/model/prototype
//object: is an instance of a class which has properties and behavior