package day8.oops;

import java.util.Scanner;

public class MethodDemo1 {

//    <access modifier> void <method name> (){
//        ======
//    }

    //method definition/declaration
    public void greet() {
        System.out.println("Hello Hello Hello!!!");
    }

    //    <access modifier> void <method name> (one or more than one numbers of parameters of any type){
//        ======
//    }
    public void displayInfo(String name, int age, double salary, boolean active) {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
        System.out.println("Active is: " + active);
    }

    public static void main(String[] args) {
        MethodDemo1 ob = new MethodDemo1();
        //method calling
        ob.greet();

        ob.displayInfo("ram", 22, 500.67, true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter your status: ");
        boolean active = sc.nextBoolean();
        ob.displayInfo(name, age, salary, active);

    }
}
