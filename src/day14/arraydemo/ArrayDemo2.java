package day14.arraydemo;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] a = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element " + i + ": ");
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            sum += a[i];
        }
        System.out.println("The sum of all element is: " + sum);
    }
}
