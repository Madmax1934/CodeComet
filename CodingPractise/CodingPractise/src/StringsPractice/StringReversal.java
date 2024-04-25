package StringsPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringReversal {
    public static void main(String[] args) {
        String s = "Geeks for Geeks";
        System.out.println(reversestring(s));
    }

    private static String reversestring(String s) {

        StringBuilder sbrev = new StringBuilder(s);
        String s1 = sbrev.reverse().toString();
        System.out.println(s1);
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isLetter(s1.charAt(i))){
                set.add(s1.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
