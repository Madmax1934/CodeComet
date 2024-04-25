package StringsPractice;

import java.util.*;

public class NonRepeatingCharacter {
    public static <List> void main(String[] args) {
        String str = "yy";
        char ch[]=str.toCharArray();
        char p = 0;
        if(ch.length==2)
        {
            if(ch[0]!=ch[1])
            {
                p=ch[0];
                System.out.println(ch[0]);
            }
            else
                System.out.println(p);
        } else if (ch.length==1) {
            p=ch[0];
            System.out.println(ch[0]);
        }
        else{
        for(int i=0;i<ch.length;i++) {
            String sub = str.substring(i + 1, ch.length);
            if (!sub.contains(str.substring(i, i + 1))) {
                System.out.println(ch[i]);
                p = ch[i];
                break;
            }
        }
        }
        if(p==0)
         System.out.println("$");
    }
}
