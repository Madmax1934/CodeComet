package org.example.zeeksforgeekscoding.easy;

import java.util.HashMap;

public class RomanNumerals {
    public static void main(String[] args) {
        String str = "XXIV";

        System.out.println("result = "+romannumeral(str));
    }

    private static int romannumeral(String str) {
        HashMap<String,Integer> numerals = new HashMap<>();
        numerals.put("M", 1000);
        numerals.put("D", 500);
        numerals.put("C", 100);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("V", 5);
        numerals.put("I", 1);

        char reversed[] = new StringBuffer(str).reverse().toString().toCharArray();

        int prevval=0;
        int result = 0;
        for(char ch:reversed)
        {
            int thisval = numerals.get(Character.toString(ch));
            if(thisval>=prevval)
                result+=thisval;
            else
                result-=thisval;
            prevval=thisval;
        }
        return result;
    }
}
