package Practisedproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSumElements {
    public static void main(String[] args) {
        int N = 5, K = 3;
        int A[] = {0,0,2,1,1};
        String[] sarr = {"The","dog","is","barking","and","dancing"};
        ArrayList<String> al = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(String i:sarr)
        {
            sb.append(i+"-");
        }
        for(int i=0;i<sb.length();i+=7){
            al.add(sb.substring(i,i+7));
            System.out.println(al);
        }

        System.out.println("The final result: "+al);
        //Arrays.stream(sarr).filter(i->{if(count<=i.length());
       // System.out.println(foursum(A,K));
    }

    private static ArrayList<ArrayList<Integer>> foursum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> alist = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length-4;i++)
        {
            sum=0;
            for(int j=i;j<i+4 && i+4<arr.length;j++)
            {
                sum+=arr[j];
                a.add(arr[i]);
            }
            if(sum==k) {
              alist.add(a);
            }
        }
        return alist;
    }
}
