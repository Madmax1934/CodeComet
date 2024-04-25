package StringsPractice;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MobileKeyPad {
    public static void main(String[] args) {
        String str="GDG";
        System.out.println(printSequence(str));
    }

    public static String printSequence(String S)
    {
        // code here
        TreeMap<String,Integer> tm = new TreeMap<>();
        StringBuffer sb = new StringBuffer();

        tm.put("ABC",2);
        tm.put("DEF",3);
        tm.put("GHI",4);
        tm.put("JKL",5);
        tm.put("MNO",6);
        tm.put("PQRS",7);
        tm.put("TUV",8);
        tm.put("WXYZ",9);
        tm.put(" ",0);
        for(int i=0;i<S.length();i++)
        {

            while(tm.entrySet().iterator().hasNext()) {
                System.out.println(tm.entrySet().stream().iterator().next().getKey());
                    if (tm.entrySet().stream().iterator().next().getKey().indexOf(S.charAt(i))!=-1){
                        sb.append(tm.entrySet().stream().iterator().next().getValue());
                         break;
                    }
                }

//            while(tm.entrySet().iterator().hasNext()) {
//                System.out.println(tm.entrySet().iterator().next().getKey());
           // }
        }
        return sb.toString();
    }
}
