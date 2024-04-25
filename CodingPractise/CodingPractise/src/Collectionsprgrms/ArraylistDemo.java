package Collectionsprgrms;

import java.util.*;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        nums.add("one");
        nums.add("two");
        nums.add("three");
        for(String i:nums)
            System.out.println(i);

        //Collections.sort(nums);
        System.out.println(nums.stream().sorted().toList());

        List<Cricketers> cricketers = new ArrayList<Cricketers>();
        cricketers.add(new Cricketers("sachin",100));
        cricketers.add(new Cricketers("Dhoni",183));
        cricketers.add(new Cricketers("Kohli",100));

        Collections.sort(cricketers);
        System.out.println(cricketers);


    }
}
