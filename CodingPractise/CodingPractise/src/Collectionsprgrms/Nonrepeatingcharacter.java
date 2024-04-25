package Collectionsprgrms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Nonrepeatingcharacter {
    public static void main(String[] args) {
        String S="zxvczbtxyzvy";
        System.out.println(nonrepeatingCharacter(S));
    }

    private static char nonrepeatingCharacter(String s) {
        char ch = '$';
        LinkedHashMap<Character,Integer> lm = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            lm.put(s.charAt(i),lm.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry:lm.entrySet())
        {
            if(entry.getValue()<=1)
            {
                ch = entry.getKey();
                break;
            }
        }
        return ch;
    }
}
