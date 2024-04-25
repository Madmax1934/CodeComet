package StringsPractice;

import java.util.*;

public class CastVotes {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.print("num1 = " + num1 +", num2 = "+num2);
        String arr[] = {"johny","johny","johny","johny","john","john","john","john","Helen","Helen","Helen","Helen","Al"};
        int n=arr.length;
        String[] output = winner(arr,n);
        System.out.println(output[0]+","+output[1]);
    }

    public static String[] winner(String arr[], int n)
    {
        // add your code
        String res[]=new String[2];
        TreeMap<String,Integer> tm = new TreeMap<>();
        for(String i: arr)
        {
            if(tm.containsKey(i))
            {
                tm.put(i,tm.getOrDefault(i,0)+1);
            }
            else{
                tm.put(i,1);
            }
        }

        int val = tm.values().stream().sorted().toList().get(tm.size()-1);

        for(Map.Entry<String,Integer> e:tm.entrySet())
        {
            if(e.getValue().equals(val))
            {
                res[0]=e.getKey();
                res[1]=String.valueOf(e.getValue());
                break;
            }
        }
        return res;
    }
}
