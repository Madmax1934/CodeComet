package StringsPractice;

import java.util.*;

public class Panagramornot {
    public static void main(String[] args) {
        String str= "Bawds jog, flick quartz, vex nymph";
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(checkPanagram(str,s));
    }

    private static boolean checkPanagram(String str,String s) {

        boolean[] lettersPresent = new boolean[26];

        // Convert the string to lowercase to handle both cases (upper and lower)
        str = str.toLowerCase();

        // Iterate through the string and mark corresponding letters as present
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                lettersPresent[c - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean present : lettersPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
