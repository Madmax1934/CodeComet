package StringsPractice;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Stringtknzer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello world");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }

        StringJoiner sj=new StringJoiner(",");
        sj.setEmptyValue("sj is empty");
        System.out.println(sj);
    }
}
