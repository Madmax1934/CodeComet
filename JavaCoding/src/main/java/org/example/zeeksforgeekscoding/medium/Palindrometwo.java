package org.example.zeeksforgeekscoding.medium;

public class Palindrometwo {
    public static void main(String[] args) {
        String str ="Anne, I vote more cars race Rome-to-Vienna";
        System.out.println(ispalindrome(str));
    }

    private static boolean ispalindrome(String str) {
        String formatted = str.toLowerCase().replaceAll("[^a-z]","");
        System.out.println("formatted string = "+formatted);
        StringBuffer sbf = new StringBuffer(formatted);
        System.out.println("reversed string = "+sbf);
        if(sbf.reverse().toString().equals(formatted.trim()))
            return true;
        return false;
    }

}
