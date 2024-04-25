package StringsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ExtractMaximum {
    public static void main(String[] args) {
        String S="grg100abc123xyz455";
        String num="";
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i=0;i<S.length();i++)
        {
            if(Character.isDigit(S.charAt(i)))
            {
                num+=S.charAt(i);
            }
            else{
                if(num!="") {
                    Integer integerValue = Integer.valueOf(num);
                    alist.add(integerValue.intValue());
                    num = "";
                }
            }
        }
        alist.add(Integer.valueOf(num).intValue());
        Collections.sort(alist);
        System.out.println(alist);
        System.out.println(alist.get(alist.size()-1));
    }
}
