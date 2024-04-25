package StringsPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphixStrings {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";

        System.out.println(areIsomorphic(str1,str2));
    }

    private static boolean areIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> mapping = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (mapping.containsKey(char1)) {
                if (mapping.get(char1) != char2) {
                    return false; // Inconsistent mapping
                }
            } else {
                if (mapping.containsValue(char2)) {
                    return false; // char2 is already mapped to another char
                }
                mapping.put(char1, char2);
            }
        }

        return true;
    }
}
