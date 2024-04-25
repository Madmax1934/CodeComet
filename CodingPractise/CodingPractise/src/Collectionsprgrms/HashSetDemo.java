package Collectionsprgrms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("abc");
        hs.add("xyz");
        hs.add("pqr");
        hs.add("abc");

//        Iterator<String> itr = hs.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        for(String i:hs)
        {
            System.out.println(i);
        }

        //looping using foreach

        hs.forEach(System.out::println);
    }
}
