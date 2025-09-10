package day17.exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        try {
            System.out.println("try block start");
            int div = divide(a, b);
            System.out.println("The division is: " + div);
            System.out.println("try block end");
        } catch (ArithmeticException e) {
            System.out.println("inside catch block");
        }
        System.out.println("program terminated");
    }

    public static int divide(int a, int b) {
        return a/b;
    }
}
//try  => block
//catch => block
//finally => block
//throws  => clause
//throw  => statement
