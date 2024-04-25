package Collectionsprgrms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<String> hs = new TreeSet<>();
        hs.add("abc");
        hs.add("xyz");
        hs.add("abc");
        hs.add("pqr");
        hs.add("");
        hs.add("");
        hs.add("lmn");
        System.out.println(hs);
    }
}
