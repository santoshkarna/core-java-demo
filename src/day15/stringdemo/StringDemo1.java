package day15.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //implicit creation
        String str = "Hello World";
        System.out.println(str);

        //explicit creation
        String s1 = new String();
        System.out.println(s1);

        String s2 = new String("Hello World");
        System.out.println(s2);

        byte[] b = {65, 66, 67};
        String s3 = new String(b);
        System.out.println(s3);

        char [] ch = {'a', 'b', 'c'};
        String s4 = new String(ch);
        System.out.println(s4);

    }
}
