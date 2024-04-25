package StringsPractice;

import java.util.*;

public class Uncommonchars {
    public static void main(String[] args) {
        String A = "abcde";//"characters";// "geeksforgeeks";
        String B = "alphabets";//"geeksquiz";

        int m=A.length();
        int n=B.length();
        int max = 0;
        //System.out.println(concatenatedString(A,B));
        System.out.println(firstRep(A));
        SortedSet<Character> set = new TreeSet<>();//String res = "";
        List<Character> listA = new ArrayList<>();
        List<Character> listB = new ArrayList<>();

        //Adding A to listA
        for(int i=0;i<A.length();i++)
            listA.add(A.charAt(i));

        //Adding B to listB
        for(int i=0;i<B.length();i++)
            listB.add(B.charAt(i));

        //Add uncommon elements of B to res
        for(int i=0;i<B.length();i++)
        {
            if(!listA.contains(B.charAt(i)))
                set.add(B.charAt(i));
        }
        //Add uncommon elements of A to res
        for(int i=0;i<A.length();i++)
        {
            if(!listB.contains(A.charAt(i)))
                set.add(A.charAt(i));
        }

//        for(char c: set)
//            fin+=c
//        String fin = new String(set.toString());
        System.out.println();
    }

    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        StringBuffer sb = new StringBuffer();
        int len =0;
        if(s1.length()<s2.length())
            len = s1.length();
        else
            len = s2.length();
        for(int i=0;i<s2.length();i++)
        {
            if(s1.indexOf(s2.charAt(i),0)==-1)
            {
                sb.append(s2.charAt(i));
            }
        }

        for(int i=0;i<s1.length();i++)
        {
            if(s2.indexOf(s1.charAt(i),0)==-1)
            {
                sb.append(s1.charAt(i));
            }
        }

       return sb.isEmpty()?String.valueOf(-1):sb.toString();

    }

    static char firstRep(String S)
    {
        // your code here
        for(int i=0;i<S.length();i++)
        {
            if(S.indexOf(S.charAt(i),i+1)!=-1)
                return S.charAt(i);
        }

        return (char)-1;
    }
}
