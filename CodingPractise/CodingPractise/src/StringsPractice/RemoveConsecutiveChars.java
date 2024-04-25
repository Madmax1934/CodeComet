package StringsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveConsecutiveChars {
    public static void main(String[] args) {
        String S="abcde";//"geeksforgeeks"
        //System.out.println(removeConsecutiveCharacter(S));
        System.out.println(repeatingCharacter(S));
    }

    private static char repeatingCharacter(String s) {

        LinkedHashMap<Character,Integer> lm = new LinkedHashMap<>();
        char ch='\0';
        //Character.valueOf('-1');
        System.out.println("initialized ch="+ch);
        for(int i=0;i<s.length();i++)
        {
                lm.put(s.charAt(i),lm.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry:lm.entrySet())
        {
            if(entry.getValue()>1)
            {
                ch=entry.getKey();
                break;
            }
        }
        return ch == '\0' ? (char) -1 : ch;
    }

    private static String removeConsecutiveCharacter(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=1;i<sb.length();i++)
        {
            if(sb.charAt(i)==sb.charAt(i-1))
            {
                sb.deleteCharAt(i);
                System.out.println("after deleting char "+i+" sb = "+sb);
            }
        }
        return sb.toString();
    }
}
