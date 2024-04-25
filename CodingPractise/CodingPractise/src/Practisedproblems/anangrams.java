package Practisedproblems;

import java.util.Arrays;

public class anangrams {
    public static void main(String[] args) {
        String a = "act";
        String b="tca";
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        if(arr.length==brr.length)
        {
            Arrays.sort(arr);
            Arrays.sort(brr);
            System.out.println(Arrays.equals(arr,brr));
            if(Arrays.equals(arr,brr))
                System.out.println("Both are anagrams");

        }
    }
}
