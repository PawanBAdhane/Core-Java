package org.example.Core.Collection;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);  //node 1
        ll.add(20);  //node 2
        ll.add(30);  //node 3
        ll.add(40);  //node 4

        System.out.println(ll); //10, 20, 30, 40

        ll.add(1, 15);
        System.out.println(ll);  //10, 15, 20, 30, 40

        System.out.println(ll.getLast());

        /*System.out.println(l1.get(0));*/

    }
}
