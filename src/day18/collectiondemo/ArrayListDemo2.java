package day18.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(15);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("==============");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("===========");
        for(Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("===========");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("===========");
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous()+" ");
        }
    }
}
