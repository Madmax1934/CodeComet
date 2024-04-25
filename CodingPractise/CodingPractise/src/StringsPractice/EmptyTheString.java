package StringsPractice;

import java.util.Collections;
import java.util.StringTokenizer;

public class EmptyTheString {
    public static void main(String[] args) {
        String s ="111";//"gegeekek";
        //System.out.println(emptythestring(s));


        int sum=0;
        int sval=Integer.parseInt(s);
        for(int i=s.length()-1;i>=0;i--)
        {
            int p = (int)Math.pow(2,i);
            int digit = sval%10;
            sval/=10;
            sum+=(p*digit);
        }
        int newno = sum+1;
        System.out.println(binaryrep(newno));

    }

    private static String binaryrep(int newno) {
        StringBuffer sb =new StringBuffer();

        while(newno >0)
        {
            sb.append((newno)%2);
            (newno)/=2;
        }
        return sb.reverse().toString();
    }

    private static int emptythestring(String s) {
        int index = s.indexOf("geek");

        if(s.isEmpty())
            return 0;
        // If "geek" is not found, we cannot delete it further.
        if (index == -1 ) {
            return index;
        }

        // Delete "geek" and recursively call the function on the modified string.
        String modifiedString = s.substring(0, index) + s.substring(index + 4);
        return index<0?-1:1 + emptythestring(modifiedString);
    }
}
