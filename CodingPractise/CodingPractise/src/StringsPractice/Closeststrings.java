package StringsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Closeststrings {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("the");
        s.add("quick");
        s.add("brown");
        s.add("fox");
        s.add("the");

        String s1 = "the";
        String s2 = "the";

        int dist = shortestdistance(s, s1, s2);
        System.out.println(dist);
    }

    private static int shortestdistance(List<String> s, String s1, String s2) {

        int minDistance = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        if(s1==s2)
        {
            return 0;
        }

        for (int i = 0; i < s.size(); i++) {
            String word = s.get(i);

            if(word.equals(s1) && word.equals(s2))
            {
                index1=i;
                index2=i;
            }

            else if (word.equals(s1)) {
                index1 = i;
            } else if (word.equals(s2)) {
                index2 = i;
            }

            if (index1 != -1 && index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }

        }
        return minDistance;
    }
}
