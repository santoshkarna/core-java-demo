package day14.arraydemo;

public class ArrayDemo1 {

    public static void main(String[] args) {
        //<type> [] >array name> = new  <type> [size of an element]
        int  [] arr = new int [3];
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
//        arr[3] = 14;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
