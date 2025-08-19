package day4.basic;

public class OperatorsDemo1 {
    public static void main(String[] args) {
        //1.Arithmetic Operators: + - * / %
        //priority: + -(low) * / %(high)
        //Associativity: Left to Right

        int a = 4 + 5 - 7 / 3 + 3 * 5 - 7 % 2;
        a = 4 + 5 - 2 + 3 * 5 - 7 % 2;
        a = 4 + 5 - 2 + 15 - 7 % 2;
        a = 4 + 5 - 2 + 15 - 1;
        a = 9- 2 + 15 - 1;
        a = 7 + 15 - 1;
        a = 22 - 1;
        a = 21;
        System.out.println(a);
    }
}
