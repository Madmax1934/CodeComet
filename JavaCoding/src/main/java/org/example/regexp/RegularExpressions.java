package org.example.regexp;

import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("sursanforsurs*n","sursanforsursan"));
        System.out.println(Pattern.matches(
                "geeksforge*ks", "geeksforgeeks"));
    }
}
