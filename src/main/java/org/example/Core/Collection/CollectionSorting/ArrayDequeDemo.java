package org.example.Core.Collection.CollectionSorting;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.add("one");
        ad.add("two");
        ad.add("three");
        ad.addFirst("Ashok");

        System.out.println(ad);

        ad.pollFirst();
        System.out.println(ad);

        ad.pollLast();
        System.out.println(ad);
    }
}
