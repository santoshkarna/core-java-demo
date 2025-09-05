package day16.stringdemo;

import java.util.StringTokenizer;

public class StringDemo7 {

    public static void main(String[] args) {
        String str = "Hello,, Good Morning from Nepal,, I am Santosh Lal Karna,, I am java Developer,, I also teach Java Full Stack.";
        System.out.println(str);
        StringTokenizer st = new StringTokenizer(str, ",");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("===========");
        String[]  lines = str.split(",");
        System.out.println(lines.length);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
