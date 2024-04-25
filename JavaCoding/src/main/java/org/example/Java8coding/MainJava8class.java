package org.example.Java8coding;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainJava8class {
    public static void main(String[] args) {
        //filtering Employee class data
        List<Employee> employees= List.of(
                new Employee("Ramesh",25,"male","IT"),
                new Employee("Suresh",30,"male","HR"),
                new Employee("Ganesh",22,"male","IT"),
                new Employee("Jane",23,"female","IT"),
                new Employee("Gamora",25,"female","HR")
        );

        Map<String,Long> empmap = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        empmap.entrySet().forEach(System.out::println);
        System.out.println("counts of department details printed");

        Map<String,Double> avgage = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingInt(Employee::getAge)));
    }
}
