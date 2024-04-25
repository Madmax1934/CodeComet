package ArrayPractise;

import java.util.*;
import java.util.stream.Collectors;

public class ArrSubsetOfanotherArray {
    public static void main(String[] args) {
        long a1[]={11, 7, 1, 13, 21, 3, 7, 3};
        long a2[]= {11, 3, 7, 1, 7};
        long n,m;
        n=a1.length;
        m=a2.length;
        int flag=0;

//        System.out.println(Arrays.stream(a1).boxed().collect(Collectors.toList()).containsAll(
//                Arrays.stream(a2).boxed().collect(Collectors.toList())));
//
//        for(long val:a2)
//        {
//            if(!Arrays.stream(a1).filter(i->i==val).findFirst().isPresent()){
//                flag=1;
//                break;
//            }
//
//        }

        Map<Long, Integer> frequencyMap = new HashMap<>();

        for (long num : a1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (long num : a2) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) == 0) {
                System.out.println("No");
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }

        System.out.println("Yes");
    }
}
