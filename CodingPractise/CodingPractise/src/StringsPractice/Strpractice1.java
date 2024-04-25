package StringsPractice;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Strpractice1 {

    public static void main(String[] args) {
        String s1 = "Sursan";
        String s2="sahera";
        int d=2;
        System.out.println(leftrotate(s1,d));
        System.out.println(rightrotate(s2,d));
    }

    static String leftrotate(String str, int k)
    {
        str = str.substring(k)+str.substring(0,k);
        return str;
    }

    static String rightrotate(String str, int k)
    {
        str = leftrotate(str,str.length()-k);
        return str;
    }

}
