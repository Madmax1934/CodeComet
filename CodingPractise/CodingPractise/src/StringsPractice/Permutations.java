package StringsPractice;

import java.util.HashSet;

public class Permutations {
    public static void main(String[] args) {
        String input = "aba";
        int size = 2;
        printPermutations(input, size);
    }

    public static void printPermutations(String input, int size) {
        if (input == null || input.length() < size) {
            System.out.println("Invalid input.");
            return;
        }

        HashSet<String> permutations = new HashSet<>();
        generatePermutations(input, size, "", permutations);

        System.out.println("Permutations of size " + size + ":");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    private static void generatePermutations(String input, int size, String current, HashSet<String> permutations) {
        if (size == 0) {
            permutations.add(current);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String remaining = input.substring(0, i) + input.substring(i + 1);
            generatePermutations(remaining, size - 1, current + c, permutations);
        }
    }
}

