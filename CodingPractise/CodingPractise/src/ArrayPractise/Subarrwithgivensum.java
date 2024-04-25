package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subarrwithgivensum {
    public static void main(String[] args) {

        int n=5,s=12;
        int arr[]= {1,2,3,7,5};
        List<Integer> li = new ArrayList<>();
        ArrayList<Integer> list  = subarrsum(arr,s);
        /*int sum;
        for(int j=0;j<n;j++) {
            sum=0;
            for (int i = j; i < n; i++) {
                sum += arr[i];
                if(sum>s)
                    break;
                if (sum == s) {
                    li.add(j+1);
                    li.add(i+1);
                    break;
                }
            }
            if(!li.isEmpty()){
                break;
            }
        }
        if(li.isEmpty()) System.out.println(-1);
        else
          System.out.println(li);


         */
    }

    private static ArrayList<Integer> subarrsum(int[] arr, int s) {
        ArrayList<Integer> li = new ArrayList<>();

        int start = 0, end = 0;
        int sum = 0;

        while (end < arr.length) {
            if(s==0)
                break;
            sum += arr[end];

            while (sum > s) {
                sum -= arr[start];
                start++;
            }

            if (sum == s) {
                li.add(start + 1);
                li.add(end + 1);
                break;
            }

            end++;
        }

        if (li.isEmpty()) {
            li.add(-1);
        }
        return li;
    }
}
