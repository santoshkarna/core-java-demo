package day16.stringdemo;

public class StringDemo6 {
    public static void main(String[] args) {
        String str = "Hello, Good Morning from Nepal, I am Santosh Lal Karna, I am java Developer, I also teach Java Full Stack.";
        System.out.println(str);
        String[]  lines = str.split(",");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
