package org.example.Core.Collection.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main (String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "John");
        map.put(102, "Smith");
        map.put(103, "Orlen");

        System.out.println("Map size:: " + map.size());

    }
}
