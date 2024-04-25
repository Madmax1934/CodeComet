package StringsPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        //firstRepChar(S);
        Valuesetter();

    }

    private static String sampleMethod(String pwd)
    {
        return pwd.toUpperCase();
    }
    private static void Valuesetter() {
        String mem_pwd = sampleMethod("abcd");
        System.out.println(mem_pwd);
    }

    private static void firstRepChar(String s) {
        for(int i=0;i<s.length();i++)
        {
            if(s.substring(i,s.length()).indexOf(s.charAt(i))!=-1)
            {
                System.out.println(s.charAt(i)+": "+i);
            }
        }

    }
}
