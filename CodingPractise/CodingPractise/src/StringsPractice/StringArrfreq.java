package StringsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringArrfreq {

    public static void main(String[] args) {
        String[] strs = {"apple", "banana", "orange", "banana", "apple", "banana"};
        HashMap<String,Integer> hm = new HashMap<>();
        for (String str : strs)
        {
            hm.put(str,hm.getOrDefault(str,0)+1);
        }

        for(Map.Entry<String,Integer> entry : hm.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

}
