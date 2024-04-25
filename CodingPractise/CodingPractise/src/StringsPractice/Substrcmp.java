package StringsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Substrcmp {
    public static void main(String[] args) {
        String str="welcometojava";
        int k = 3;

        String substr = str.substring(0,str.length()-(k-1));
        char a[] = substr.toCharArray();
        Arrays.sort(a);
        int ind = substr.indexOf(a[0]);
        int lind = substr.indexOf(a[a.length-1]);
           if(substr.contains(String.valueOf(a[0])))
           {
               System.out.println(str.substring(ind,ind+k));
           }
           if(substr.contains(String.valueOf(a[a.length-1])))
           {

               System.out.println(str.substring(lind,lind+k));

           }
        }
}
