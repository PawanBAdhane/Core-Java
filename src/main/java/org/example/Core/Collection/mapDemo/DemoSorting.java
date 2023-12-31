package org.example.Core.Collection.mapDemo;

import java.util.ArrayList;
import java.util.List;

public class DemoSorting {
    public static void main(String[] args) {
        List<StudentDemo> al = new ArrayList<>();

        al.add(new StudentDemo(101, "John", 3));
        al.add(new StudentDemo(104, "Anil", 4));
        al.add(new StudentDemo(102, "Smith", 2));
        al.add(new StudentDemo(103, "Robert", 1));

        System.out.println(al);
    }
}
