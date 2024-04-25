package Practisedproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class secondsmallestnum {
    public static void main(String[] args) {
        int N = 9, K = 3;
        int arr[] = {1,2,3,1,4,5,2,3,6};
        ArrayList<Integer> arli = new ArrayList<>();
        for(int i=0;i<=(N-K);i++)
        {
            arli.add(Arrays.stream(arr,i,i+K).max().getAsInt());

        }
        System.out.println(arli);
    }
}
