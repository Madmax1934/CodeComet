package Practisedproblems;

import java.util.Set;
import java.util.TreeSet;

public class removenreverse {
    public static void main(String[] args) {
        String S = "ppegwfhzvizgvhanxfjsuieabygssqultzcrmxcgmzgbsxxvdfeqdijphfjbrdwastkhzspqzpfxhgjfkymwyo";
        Set<Character> set = new TreeSet<Character>();
        StringBuffer sb = new StringBuffer(S);
        int i=0;
        while(i<sb.length())
        {
            if(!set.contains(sb.charAt(i)))
            {
                set.add(sb.charAt(i));
                i++;
            }
            else
            {
                int index = sb.indexOf(String.valueOf(sb.charAt(i)));
                sb.delete(index,index+1);
                System.out.println(sb);
                sb=sb.reverse();
                i=0;
                set.clear();
            }

        }
        System.out.println(sb);
    }
}
