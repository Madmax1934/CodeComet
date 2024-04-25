package org.example.corejavacoding;

import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingWithStrings {

    public static void main(String[] args) {
        String str = "Sursan";

        ReverseString(str);
        System.out.println(ContainsVowels(str));;
    }

    private static boolean ContainsVowels(String str) {

//        char charr[]=new char[str.length()];
//        charr = str.toLowerCase().toCharArray();
//        for(int i=0;i<charr.length;i++)
//        {
//            if(charr[i]=='a'||
//                    charr[i]=='e'||charr[i]=='i'||
//                    charr[i]=='o'||charr[i]=='u')
//            {
//                return true;
//            }
//        }
//
//        return false;

        //another way using regex

        Pattern pattern=Pattern.compile("[aeiou]",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    private static void ReverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
