package day7.basic;

import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        int choice = sc.nextInt();

        switch (choice) {//start
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }//end
        System.out.println("rest of the code");
    }
}
