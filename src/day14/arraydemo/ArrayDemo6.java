package day14.arraydemo;

import java.util.Scanner;

public class ArrayDemo6 {

    public static void main(String[] args) {
        final int ROWS = 3;
        final int COLUMNS = 3;
        int [] [] arr = new int[ROWS] [COLUMNS];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.println("Enter element " + (i+1) + "th element");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
