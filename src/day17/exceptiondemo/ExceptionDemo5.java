package day17.exceptiondemo;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1];
        try {
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            arr[1] = divide(a, b);
            System.out.println("The division is: " + arr[1]);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Exception: " + e);
            System.out.println("Exception message: " + e.getMessage());
        }  catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("program terminated");
    }

    public static int divide(int a, int b) {
        return a/b;
    }
}
