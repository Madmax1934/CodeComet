package org.example.Java8coding.Java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortBykeys {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(5, "Five");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(8, "Eight");
        linkedHashMap.put(1, "One");

        System.out.println("Original LinkedHashMap: " + linkedHashMap);

        Map<Integer, String> tm = new TreeMap<>();

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            tm.put(entry.getKey(), entry.getValue());
        }
        System.out.println(tm);

        /*
        // Sort the entries based on keys
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(linkedHashMap.entrySet());
        entries.sort(Map.Entry.comparingByKey());
        System.out.println(entries);

        // Create a new LinkedHashMap to hold the sorted entries
        LinkedHashMap<Integer, String> sortedLinkedHashMap = new LinkedHashMap<>();

        // Iterate through the sorted entries and add them to the new LinkedHashMap
        for (Map.Entry<Integer, String> entry : entries) {
            sortedLinkedHashMap.put(entry.getKey(), entry.getValue());
        }

        // Display the sorted LinkedHashMap
        for (Map.Entry<Integer, String> entry : sortedLinkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

         */


    }
}
