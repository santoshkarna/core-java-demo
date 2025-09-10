package day17.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

//multi-level catch block
public class ExceptionDemo4 {

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
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            System.out.println("Exception message: " + e.getMessage());
//            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Exception: " + e);
            System.out.println("Exception message: " + e.getMessage());
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println("program terminated");
    }

    public static int divide(int a, int b) {
        return a/b;
    }
}
