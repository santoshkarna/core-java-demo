package day17.exceptiondemo;

public class ExceptionDemo7 {

    public static void main(String[] args) {
        vote(2);
        System.out.println("program terminated");
    }

    public static void vote(int age){
        if(age >= 18){
            System.out.println("you can vote!!!");
        } else {
            throw new InvalidAgeException("you can't vote!!!");
        }
    }
}
