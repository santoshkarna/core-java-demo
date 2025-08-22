package day6.basic;

public class ExplicitTypeCasting {

    public static void main(String[] args) {
        double d = 100.75;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) l;
        byte b = (byte) l;
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("l = " + l);
        System.out.println("i = " + i);
        System.out.println("s = " + s);
        System.out.println("b = " + b);
    }
}
