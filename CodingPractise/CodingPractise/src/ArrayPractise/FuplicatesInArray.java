package ArrayPractise;

import java.util.*;

public class FuplicatesInArray {
    public static void main(String[] args) {
        int arr[]={5,6,5,1,1,2,3,3,2,4};
//        int distele = Arrays.stream(arr).reduce((a,b)->a^b).getAsInt();
//        System.out.println(distele);
        int n =arr.length;
        System.out.println(findduplicates(arr,n));
    }

    private static ArrayList findduplicates(int[] arr, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i:arr)
        {
            if(hm.containsKey(i)){
            hm.put(i,hm.getOrDefault(i,0)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()>=2)
            {
                al.add(entry.getKey());
            }
        }

        Collections.sort(al);

        if(al.isEmpty())
            al.add(-1);
        return al;

    }
}
