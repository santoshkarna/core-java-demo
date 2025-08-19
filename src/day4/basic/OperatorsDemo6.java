package day4.basic;

public class OperatorsDemo6 {
    public static void main(String[] args) {
        //Ternary(conditional) operators
        // ?:
        int a = 106;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b.");
        } else {
            System.out.println("b is greater than a.");
        }

        String s = (a > b) ? "a is greater than b" : "b is greater than a";
        System.out.println(s);
        boolean bb = (a > b) ? true : false;
        System.out.println(bb);
        int r = (a > b) ? 1 : 0;
        System.out.println(r);
    }
}
