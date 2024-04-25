package org.example.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/*
    HashMap:
    * Allows one null key and multiple null values
    * Not thread-safe

    HashTable:
    *Thread-safe
    * slow performance
    * null key and values are not allowed

    Synchronized map:
    *Thread-safe
    *slow performance
    *null key and multiple null values are not allowed

    Concurrent HashMap:
    * Thread - safe
    * fast performance
    * null key and values are not allowed


 */
public class Failfastandsafe {
    public static void main(String[] args) {

        List<Integer> list = new CopyOnWriteArrayList<>(); //Using CopyOnwriteArrayList to avoid ConcurrentModificationException
        list.add(1);
        list.add(2);
        list.add(3);
        //Getting an Iterator from list
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer integer = (Integer) it.next();
            list.add(4); // to avoid ConcurrentModificationException use CopyOnwrite
        }
        System.out.println(list);

        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("Google",1);
        map.put("IBM",2);

        Iterator<String> itr = map.keySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            map.put("Microsoft",3);
        }
    }
}
