package ArrayPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RevArrsingroups {
    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 3;
        int n= arr.size();
        int j=0;
        for(int i=0;i<n;i=i+k)
        {
            int left = i;
            int right = Math.min(i+k-1,n-1);
            while(left<right)
            {
                Integer temp = arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left++;
                right--;
            }
        }

        System.out.println(arr);
    }
}
