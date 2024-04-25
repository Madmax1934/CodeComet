package org.example.datastructures.Hashtables;

import java.util.HashMap;

public class InterviewQCommonArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,3,7};

        System.out.println(itemInCommon(arr1,arr2));
    }

    private static boolean itemInCommon(int[] arr1, int[] arr2) {
        HashMap<Integer,Boolean> hm = new HashMap<>();

        for(int i:arr1)
            hm.put(i,true);

        for(int j:arr2)
        {
            if(hm.get(j)!=null) return true;
        }
        return false;
    }
}
