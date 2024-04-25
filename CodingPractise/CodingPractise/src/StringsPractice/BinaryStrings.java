package StringsPractice;

import java.util.ArrayList;
import java.util.List;

public class BinaryStrings {
    public static void main(String[] args) {
        String str = "01101";
        int a = 5;
        System.out.println(binarySubStrings(a,str));
    }

    private static int binarySubStrings(int a, String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '1') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
