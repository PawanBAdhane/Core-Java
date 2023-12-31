package org.example.Core.Collection.CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;

public class DemoSorting {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(1);

        //System.out.println(al);

        System.out.println("Before sort: "+ al);
        Collections.sort(al);

        System.out.println("After sort: "+ al);
        Collections.reverse(al);

        System.out.println("After reverse: "+ al);



    }
}
