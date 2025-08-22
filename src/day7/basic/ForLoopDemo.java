package day7.basic;

public class ForLoopDemo {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 10; i <= 50; i = i + 10) {
            sum = sum + i;
            System.out.println("i: " + i);
        }
        System.out.println("sum: " + sum);
    }
}

//looping
//for loop
//while loop
//do-while loop
//enhanced for loop(for-each)