package Practisedproblems;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new Employee(10001,"sursan"));
        ar.add(new Employee(10003, "sursan"));
        ar.add(new Employee(1000,"sursan"));

        System.out.println("before sort");
        for(Employee e: ar)
        {
            System.out.println(e);
        }

        Collections.sort(ar,new sortbyName());

        System.out.println("After sort");

        for(Employee e: ar)
        {
            System.out.println(e);
        }
    }
}