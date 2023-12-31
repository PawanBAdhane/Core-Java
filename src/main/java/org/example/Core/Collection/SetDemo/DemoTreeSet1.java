package org.example.Core.Collection.SetDemo;

import java.util.TreeSet;

public class DemoTreeSet1 {
    public static void main (String[] args){

        TreeSet ts = new TreeSet();

        ts.add("raja");
        ts.add("ganesh");
        ts.add("ashok");
        ts.add("pawan");
        ts.add(1);

        System.out.println(ts);

    }
}
