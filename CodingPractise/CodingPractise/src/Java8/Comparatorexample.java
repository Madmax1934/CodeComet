package Java8;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Comparatorexample {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(105);
        values.add(203);
        values.add(309);
        values.add(402);

        //sorting the last digits of list using comparator interace
        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1%10>o2%10)?1:-1;
            }
        });

        System.out.println(values);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("abc",3);
        hm.put("abcd",4);
        hm.put("a",1);
        hm.put("ab",2);
//
//        for(Map.Entry<String,Integer> e:hm.entrySet()){
//            System.out.println(e.getKey()+", "+e.getValue());
//        }

        Comparator<Map.Entry<String,Integer>> valuecomp = (entry1,entry2)->entry1.getValue().compareTo(entry2.getValue());
        List<Map.Entry<String,Integer>> unslist = new ArrayList<>(hm.entrySet());
        unslist.sort(valuecomp);

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : unslist) {
            temp.put(aa.getKey(), aa.getValue());
        }

        Map<String,Integer> sorted = hm.entrySet().stream().sorted(comparingByValue())
                .collect(toMap(Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("map after sorting by values: "+sorted);

    }


}
