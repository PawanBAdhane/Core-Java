package org.example.Core.Collection.mapDemo;

public class StudentDemo {
    int id;
    String name;
    int rank;

    public StudentDemo(int id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public String toString() {
        return  "Student [id="  +id + ", name=" +name + ", rank=" + rank + "]";

    }
}
