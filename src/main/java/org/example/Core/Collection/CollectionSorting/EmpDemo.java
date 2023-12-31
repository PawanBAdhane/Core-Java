package org.example.Core.Collection.CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpDemo {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();

        emps.add(new Employee(101, "David",15000.00));
        emps.add(new Employee(106, "Putin", 25000.00));
        emps.add(new Employee(105, "Cathy", 45000.00));
        emps.add(new Employee(104, "Anny", 35000.00));

        //Collections.sort(emps, new EmpIdComparator());
        //Collections.sort(emps, new EmpNameComparator());

        Collections.sort(emps, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.id - e2.id;
            }
        });

        Collections.sort(emps, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });

        for (Employee e: emps){
            System.out.println(e);
        }

    }
}
