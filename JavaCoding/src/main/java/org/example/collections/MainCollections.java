package org.example.collections;

import java.util.*;
import java.util.stream.Collectors;

public class MainCollections {
    public static void main(String[] args) {
        List<Student> mylist = new ArrayList<>();

        mylist.add(new Student(1,"Ramesh",22));
        mylist.add(new Student(2,"Suresh",25));
        mylist.add(new Student(6,"Ganesh",12));
        mylist.add(new Student(5,"Mahesh",32));

        Collections.sort(mylist, (o1, o2)-> o1.getAge()-o2.getAge());

        System.out.println(mylist);

        //sorting hashmap based on values:
        Map<Integer,String> hm = new HashMap<>();

        hm.put(1,"Pulkit");
        hm.put(5,"ankit");
        hm.put(3,"Ramesh");
        hm.put(2,"Suresh");
        hm.put(4,"Suresan");


        List<Map.Entry<Integer,String>> entryList = new ArrayList<>(hm.entrySet());

        Collections.sort(entryList,Comparator.comparing(Map.Entry::getValue));

        System.out.println(entryList);
        Map<Integer,String> smap= new LinkedHashMap<>();

                for (Map.Entry<Integer, String> entry : entryList) {
                   smap.put(entry.getKey(),entry.getValue());
                }

        System.out.println(smap);

                //using java8

        hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,(oldval,newval)->oldval,
                        LinkedHashMap::new));

    }
}
