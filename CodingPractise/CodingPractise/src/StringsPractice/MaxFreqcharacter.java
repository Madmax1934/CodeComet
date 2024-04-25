package StringsPractice;

import java.util.*;

public class MaxFreqcharacter {
    public static void main(String[] args) {
        String s = "testsample";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c: s.toCharArray())
        {
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }

        List<Character> list = new ArrayList<>();
        int max = Collections.max(hm.values());
        for(Map.Entry<Character, Integer> entry : hm.entrySet())
        {
            if(entry.getValue()==max)
            {
                list.add(entry.getKey());
            }
            Collections.sort(list);
        }
        System.out.println("final max key:"+list.get(0));
    }
}
