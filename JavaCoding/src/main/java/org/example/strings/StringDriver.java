package org.example.strings;

public class StringDriver {
    public static void main(String[] args) {
        String str1= "ABc";
        String str2="ABc";
        String str3  = new String("ABc");
        String str4 = new String("ABc");

        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str2));//true
        System.out.println(str1==str2);//true
        System.out.println(str3==str4);//false
        System.out.println(str1==str3);//false
    }
}
