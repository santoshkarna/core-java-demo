package day4.basic;

public class LiteralsDemo {

    public static void main(String[] args) {
        //Literals: a source code representation of fixed value
        //Literals: fixed value + data ype
        //1.Integer Literal type 436 8798 8797987987 98089080 (int)
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 2147483647;
        long l2 = 2147483648L;
        long l3 = 9223372036854775807L;

        //2.floating literal 23.45 67.89 (double)
        float f = 32.45F;
        double d = 32.45;

        //3.boolean literals true false
        boolean bl1 = true;
        boolean bl2 = false;

        //4.Character Literals '1' 'a' '@'
        char ch1 = 'a';
        char ch2 = '1';
        char ch3 = '@';
        char ch4 = '\u0000';

        //5.String Literals: "fsd"
        String s1 = "hello";
        String s2 = "abc@123#!";
        String s3 = "123";
        String s4 = "23.45";
        String s5 = "true";
        String s6 = "";
        String s7 = " ";
        String s8 = "Hello, I am Santosh Lal Karna. I am From Nepal. I am Full Stack Java Developer.";
        String s9 = "a";

        //6. Null Literals
        String s10 = null;

        //this is an object in java
        LiteralsDemo ob = new LiteralsDemo();
        LiteralsDemo obj = null;

    }
}
