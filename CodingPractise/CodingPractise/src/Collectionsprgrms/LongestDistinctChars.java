package Collectionsprgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestDistinctChars {
    public static void main(String[] args) {
        String s = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";//"aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
        String s1 = "geeksforgeeks",s2 = "forgeeksgeeks";
        System.out.println(longetsdidtchars(s));
        System.out.println(areRotations(s1,s2));
        System.out.println(firstRepeatedChar(s));
    }

    private static String firstRepeatedChar(String s) {
        //StringBuilder sb = new StringBuilder(s);
        int minindex=s.length();
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    if(j<minindex)
                      minindex=j;
                }
            }
            if(minindex==1)
                break;
        }
        return minindex==s.length()?"-1":s.substring(minindex,minindex+1);

    }


    //checks if a s2 is rotated version of s1
    private static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String concatenated = s1 + s1;

        return concatenated.contains(s2);

    }

    //returns the longest distinct subarray
    private static int longetsdidtchars(String s) {
        List<Character> list=new ArrayList<>();
        int max=0;
        for(int j=0;j<s.length();j++) {
            for (int i = j; i < s.length(); i++) {
                if (!list.contains(s.charAt(i))) {
                    list.add(s.charAt(i));
                } else {
                    if (list.size() > max) {
                        max = list.size();
                    }
                    list.clear();
                    break;
                }
            }
        }
        return max;
    }
}
