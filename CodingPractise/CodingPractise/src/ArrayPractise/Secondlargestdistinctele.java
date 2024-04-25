package ArrayPractise;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Secondlargestdistinctele {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        //System.out.println(Arrays.stream(arr).anyMatch(i -> i == 10));
        Set<Integer> set = new HashSet<>();
        for(int i: arr)
            set.add(i);

        System.out.println(set.stream().sorted().skip(set.size()-2).findFirst().orElse(null));

        int[] array1 =  {3, 2, 2, 7};
        int []array2 =  {3, 4, 2, 2, 4};
        ArrayList<Integer> alist1 = new ArrayList<>();
        ArrayList<Integer> alist = new ArrayList<>();

        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i:array1)
        {
            alist1.add(i);
        }
        for(int j=0;j<array2.length;j++)
        {
            if(alist1.contains(array2[j]))
            {
                alist.add(array2[j]);
            }
        }


        alist.forEach(k-> System.out.println(k));
//        int[] commonElements=Arrays.stream(array1)
//                .filter(Arrays.asList(array2)::contains).toArray();



    }
}
