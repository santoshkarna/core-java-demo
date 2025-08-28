package day8.oops;

public class MethodDemo2 {

    //    <access modifier> <return type> <method name> (){
//        ======
    // return matching and suitable value with return type
//    }

    public int sum() {
        int a = 6;
        int b = 7;
        int add = a + b;
//        return 1;
//        return a+b;
//        return a, b;
//        return 5, 6;
        return add;
    }

    //    <access modifier> return <method name> (one or more than one numbers of parameters of any type){
//        ======
    // return matching and suitable value with return type
//    }

    public String displayInfo(String name, int age, double salary, boolean active) {
        String info = "Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Active: " + active;
        return info;
    }

    public static void main(String[] args) {
        MethodDemo2 ob = new MethodDemo2();
        int r = ob.sum();
        System.out.println(r);

       String info =  ob.displayInfo("raju", 12, 235.45, true);
        System.out.println(info);
    }
}
