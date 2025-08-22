package day7.basic;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        String choice = sc.next();

        switch (choice) {//start
            case "add":
                System.out.println("Addition");
                break;
            case "subtract":
                System.out.println("Subtraction");
                break;
            case "multiply":
                System.out.println("Multiplication");
                break;
            case "divide":
                System.out.println("Division");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }//end
        System.out.println("rest of the code");
    }
}
