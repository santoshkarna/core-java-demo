package day7.basic;

import java.util.Scanner;

public class Q10B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double m = s * (s - a) * (s - b) * (s - c);
        double area = Math.sqrt(m);
        System.out.println("The area of the triangle is " + area);
    }
}
