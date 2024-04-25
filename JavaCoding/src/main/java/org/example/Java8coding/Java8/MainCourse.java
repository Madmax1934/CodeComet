package org.example.Java8coding.Java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainCourse {
    public static void main(String[] args) {
        List<Course> courses =
        List.of(new Course("Java",1000,2000),
                new Course("DevOps",2000,4000),
                new Course("Python",5000,10000),
                new Course("React",2000,6000),
                new Course("Spring",6000,3000)
        );

        System.out.println(courses.stream().anyMatch(x -> x.getStudents() > 2000));
        System.out.println(courses.stream().sorted(Comparator.comparing(Course::getStudents)).collect(Collectors.toList()));

    }
}
