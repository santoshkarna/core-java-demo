package day16.stringdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String str = "Hello, Good Morning from Nepal, I am Santosh Lal Karna, I am java Developer, I also teach Java Full Stack.";
        System.out.println(str);
       StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
