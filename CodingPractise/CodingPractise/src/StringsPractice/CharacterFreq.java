package StringsPractice;

import java.util.HashMap;
import java.util.Map;

public class CharacterFreq {
    static int MAX = 26;
    public static void main(String[] args) {

        String s = "geeksforgeeks";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c: s.toCharArray())
        {
            if(hm.containsKey(c))
              hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }

        for(Map.Entry<Character, Integer> entry:hm.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        //character freq using ASCII array

        int freq[]=new int[MAX];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<MAX;i++)
        {
            if(freq[i]==0)
                continue;
            System.out.print((char)(i+'a')+":"+freq[i]);
        }

    }
}
