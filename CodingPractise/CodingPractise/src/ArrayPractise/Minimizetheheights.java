package ArrayPractise;

import java.util.Arrays;

public class Minimizetheheights {
    public static void main(String[] args) {
        int k=5;
        int arr[]={2,6,3,4,7,2,10,3,2,1};//{1,5,8,10}; 2 6 3 4 7 2 10 3 2 1
        int n=arr.length;

        Arrays.stream(arr).filter(i->i>=k).map(i->i-k).forEach(System.out::println);
        Arrays.stream(arr).filter(i->i<k).map(i->i+k).forEach(System.out::println);


    }
}
