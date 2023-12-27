package org.example.Core.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1, "Raju"));
        al.add(new Student(2, "John"));
        al.add(new Student(3, "Smith"));
        al.add(new Student(4, "Rani"));

        /*for ( Student s : al){
            System.out.println(s.toString());
        }*/



        /*for( int i = al.size()-1; i>=0; i--){
            System.out.println(al.get(i));
        }*/

        ListIterator<Student> li = al.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("===============");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

    }
}
