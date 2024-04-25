package ArrayPractise;

import java.util.Comparator;
import java.util.HashMap;

public class Checkfreqsareequal {
    public static void main(String[] args) {
        String s = "xyyz";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }

        int m1= hm.values().stream().max(Comparator.naturalOrder()).get();
        int m2= hm.values().stream().min(Comparator.naturalOrder()).get();
        if(m1-m2<=1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
