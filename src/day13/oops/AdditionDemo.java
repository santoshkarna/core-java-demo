package day13.oops;


//compile time polymorphism(static binding)
//which can be achieved by overloading of methods
public class AdditionDemo {

    public void sum(int a) {
        int b = 5;
        int add = a + b;
        System.out.println("1.Sum is: " + add);
    }

    public void sum(int a, int b) {
        int add = a + b;
        System.out.println("2.Sum is: " + add);
    }

    public void sum(int a, int b, int c) {
        int add = a + b + c;
        System.out.println("3.Sum is: " + add);
    }

    public void sum(double  a, double b) {
        double add = a + b;
        System.out.println("4.Sum is: " + add);
    }

    public double sum(double a, int b) {
        double add = a + b;
        System.out.println("5.Sum is: " + add);
        return add;
    }

    public void sum(int a, double b) {
        double add = a + b;
        System.out.println("5.Sum is: " + add);
    }

    public static void main(String[] args) {
        AdditionDemo demo = new AdditionDemo();
        demo.sum(1, 2);
        demo.sum(2.4, 3.5);
        demo.sum(2.4, 4);
    }

}
