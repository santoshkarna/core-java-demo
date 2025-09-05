package day15.stringdemo;

public class StringDemo2 {

    String name;

    public StringDemo2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        String str = new String("hello");
        System.out.println(str);
        System.out.println(str.toString());

        System.out.println("=============");
        StringDemo2 ob = new StringDemo2("hello");
        System.out.println(ob);
        System.out.println(ob.toString());

    }
}
