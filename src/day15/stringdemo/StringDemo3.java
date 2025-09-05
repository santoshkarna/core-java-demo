package day15.stringdemo;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//true

        String s5 = "hello";
        System.out.println(s1.equals(s5));//false
        System.out.println(s1.equalsIgnoreCase(s5));//true
    }
}
