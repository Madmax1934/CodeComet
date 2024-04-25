package org.example.Misc.comparatorandcomparable;

import java.util.Comparator;
import java.util.List;

public class MainEmployee implements Comparator<Employee> {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee(1,"Ramesh",1000),
                new Employee(2,"Suresh",5000),
                new Employee(3,"Ganesh",30000),
                new Employee(4,"Suyesh",12000)
        );


    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getSalary()>o2.getSalary())?1:0;
    }
}
