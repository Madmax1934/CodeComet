package StringsPractice;

import java.util.ArrayList;
import java.util.List;

public class Names {
    public static <List> void main(String[] args) {
        String str = "abc pqr xyz";
        String s[] = str.split(" ");
        int num=0;
        for(int i=0;i<s.length;i++)
        {
            System.out.print(swapp(s[i]));
            System.out.print(num++);
        }

    }

    private static String swapp(String s) {
        char[] charArray = s.toCharArray();
        char firstChar = charArray[0];
        char lastChar = charArray[charArray.length - 1];

        charArray[0] = lastChar;
        charArray[charArray.length - 1] = firstChar;

        return new String(charArray);
    }
}
