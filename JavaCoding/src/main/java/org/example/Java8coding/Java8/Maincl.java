package org.example.Java8coding.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    String name;
    Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Maincl{

    public static int compareByName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {
        List<Person> nameslist = new ArrayList<>();
        nameslist.add(new Person("xyz", 12));
        nameslist.add(new Person("abc", 22));
        nameslist.add(new Person("pqr", 42));

        Collections.sort(nameslist,Maincl::compareByName);

        nameslist.stream().map(i->i.getName()).forEach(System.out::println);

        Collections.sort(nameslist,Maincl::compareByAge);

        nameslist.stream().map(i->i.getName()).forEach(System.out::println);
    }
}
