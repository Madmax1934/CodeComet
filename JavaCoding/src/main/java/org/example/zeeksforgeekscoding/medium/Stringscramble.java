package org.example.zeeksforgeekscoding.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Stringscramble {
    public static void main(String[] args) {
        String s = "rkqodlw";
        String s2 = "worlds";
        System.out.println("issubset? "+issubset(s,s2));
    }

    private static boolean issubset(String s, String s2) {

        StringBuffer sbf = new StringBuffer(s);
        List<Character> list = new ArrayList<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            list.add(ch[i]);
        }
        for(int i=0;i<s2.length();i++)
        {
            if(!list.contains(s2.charAt(i)))
                return false;
        }
        return true;
    }
}
