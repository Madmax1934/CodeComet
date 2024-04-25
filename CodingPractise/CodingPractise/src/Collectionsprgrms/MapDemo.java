package Collectionsprgrms;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sursan",123);
        map.put("asdfgh",365);
        map.put("qwrtyu",31);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
//            if(entry.getKey()=="Sursan")
//                System.out.println(entry.getKey()+": "+entry.getValue());
        }

        Comparator<Map.Entry<String,Integer>> sortmap = (entry1,entry2)-> entry1.getValue().compareTo(entry2.getValue());
        List<Map.Entry<String,Integer>> unslist = new ArrayList<>(map.entrySet());
        unslist.sort(sortmap);
        
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
