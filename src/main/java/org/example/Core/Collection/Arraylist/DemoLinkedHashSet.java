package org.example.Core.Collection.Arraylist;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main (String[] args){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(null);
        lhs.add(40);
        lhs.add(20);

        System.out.println(lhs);
    }
}
