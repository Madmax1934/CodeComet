package ArrayPractise;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Binarysearch {
    public static void main(String[] args) {
        int k=5;
        int arr[]={1,2,3,49,5,5,2,2};
        int res = Arrays.stream(arr).filter(i->i==k).findFirst().orElse(-1);
        int ind = Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(res);
        System.out.println(res+": "+ ind);
        int cnt = ((int) Arrays.stream(arr).filter(i -> i == k).count());
        System.out.println("occurence of "+k+" in array is : "+cnt);
    }

}
