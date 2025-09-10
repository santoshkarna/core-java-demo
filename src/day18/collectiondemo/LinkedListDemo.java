package day18.collectiondemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(13);
        list.add(15);
        list.add(18);
        System.out.println(list);
        list.add(22);
        System.out.println(list);
        list.add(2, 29);
        System.out.println(list);
        list.set(3, 35);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf(29));
        System.out.println(list.contains(35));
//        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.addFirst(32);
        System.out.println(list);
        list.addLast(37);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);


        List<Integer> list2 = new LinkedList<>();
        list2.add(12);
        System.out.println(list2);
        //list2.addAll(list);
        list2.addAll(0, list);
        System.out.println(list2);
//        list2.removeAll(list);
        list2.retainAll(list);
        System.out.println(list2);


    }
}
