package Collectionsprgrms;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
You are given an array A of size N. you need to insert the elements of A into
a map(element as key and index as value) and display the results. Also, you need to erase
a given element x from the map and print "erased x" if successfully erased, else print "not found".
 */
public class Mapoperations {
    public static void main(String[] args) {
        int arr[]={9, 8, 7, 4, 4, 2, 1, 1, 9, 8};
        int n=10;int x=1;
        Map<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(arr[i],i);
        }

        display(mp);
        if(mp.containsKey(x))
        {
            System.out.println("erased "+x);
            mp.remove(x);
        }
        display(mp);

    }

    private static void display(Map<Integer, Integer> mp) {
        for(Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
