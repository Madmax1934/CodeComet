package StringsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given a string S. The task is to find all permutations (need not be different) of a given string.

Example 1:

Input:
S = AAA
Output: AAA AAA AAA AAA AAA AAA
Explanation: There are total 6 permutations, as given in the output.
 */


public class StringPermutations {
    public static void main(String[] args) {
        String input = "aaa";
        List<String> permutations = generatePermutations(input);

        System.out.println("Permutations of '" + input + "':");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> generatePermutations(String input) {
        List<String> result = new ArrayList<>();
        generatePermutationsHelper("", input, result);
        return result;
    }

    private static void generatePermutationsHelper(String prefix, String remaining, List<String> result) {
        int length = remaining.length();

        if (length == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generatePermutationsHelper(newPrefix, newRemaining, result);
            }
        }
    }
}

