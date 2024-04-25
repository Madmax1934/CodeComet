package SDEProblems;

import java.util.Arrays;

public class MaximizeToys {
    public static void main(String[] args) {
        int N=7;
        int K=50;
        int arr[] = {1, 12, 5, 111, 200, 1000, 10};
        int sum=0;
        //Arrays.sort(arr);
        System.out.println(Arrays.stream(arr).sorted().filter(i->(sum+i<=K)).count());

    }
}
