package ArrayPractise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Largestsubarrwith0sum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        int n=arr.length;

        Map<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == 0) {
                maxLength = i + 1;
            }

            if (sumMap.containsKey(currentSum)) {
                maxLength = Math.max(maxLength, i - sumMap.get(currentSum));
            } else {
                sumMap.put(currentSum, i);
            }
        }
        System.out.println(maxLength);
    }
}
