package day6.basic;

public class NestedIfElseDemo {

    public static void main(String[] args) {
        int a = 14;
        int b = 5;
        int c = 17;
        if(a > b){
            if(a > c){
                System.out.println("a is largest one.");
            } else {
                System.out.println("c is largest one.");
            }
        } else {
            if(b > c){
                System.out.println("b is largest one.");
            } else {
                System.out.println("c is largest one.");
            }
        }
        System.out.println("rest of the code.");
    }
}
