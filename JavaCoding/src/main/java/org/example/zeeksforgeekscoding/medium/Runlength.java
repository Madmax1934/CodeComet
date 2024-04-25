package org.example.zeeksforgeekscoding.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Runlength {
    public static void main(String[] args) {
        String str = "wwwggopp";
        System.out.println(runlength(str));
    }

    private static String runlength(String str) {
        String s="";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++)
        {
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            s+=entry.getValue();
            s+=entry.getKey();
        }
        return s;
    }
}
