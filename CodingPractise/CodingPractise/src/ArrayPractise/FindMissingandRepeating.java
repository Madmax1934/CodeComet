package ArrayPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
public class FindMissingandRepeating {

    public static void main(String[] args) {
        int arr[]={1};//{1,3,3};
        int n= 2;
        int res[]=new int[2];
        System.out.println("missing no. is="+missingnumber(arr,n));
        Arrays.sort(arr);
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                res[0]=arr[i];
                res[1]=arr[i-1];
                System.out.println(res[0]+", "+res[1]);//return i; // Found a duplicate element at index i
            } else {
                seen.add(arr[i]);
            }
        }
    }

    private static int missingnumber(int[] array, int n) {
        int standardsum = n*(n+1)/2;
        int arrsum = Arrays.stream(array).sum();
        return standardsum-arrsum;
    }


}
