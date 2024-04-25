package StringsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindStrIndex {
    public static void main(String[] args) {
        String str="aabcaabccc";//"GeeksForgeeks";
        String s="Fr";
        String []strs = {"aaa","bbb","aaa","aaa","ccc","bbb"};
        int N=strs.length;
        //char stra[] = str.toCharArray();
       // System.out.println(str.indexOf(s));
        System.out.println(encode(str));
        //System.out.println(secFrequent(strs,N));
    }

    static String encode(String str)
    {
        String s="";
        int count=1;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else{
                s+=str.charAt(i);
                s+=count;
                count=1;
            }
            if(i==str.length()-2 && (str.charAt(i)==str.charAt(i+1)))
            {
                s+=str.charAt(i);
                s+=count;
            }
            if(i==str.length()-2 && (str.charAt(i)!=str.charAt(i+1)))
            {
                s+=str.charAt(i+1);
                s+=count;
            }
        }
        return s;
    }

    static String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer> hm = new HashMap<>();
        String res="";
        for(String s: arr)
        {
            if(hm.containsKey(s))
            {
                hm.put(s,hm.getOrDefault(s,0)+1);
            }
            else
                hm.put(s,1);
        }
        int valtofind = hm.values().stream().sorted().toList().get(hm.size()-2);
        for(Map.Entry<String,Integer> entry:hm.entrySet()) {
            if (entry.getValue().equals(valtofind))
                res=entry.getKey();
        }
        return res;
    }
}
