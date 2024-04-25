package org.example.zeeksforgeekscoding.medium;

public class EvenPairs {
    public static void main(String[] args) {
        String str = "wer4561321sdfgh67asdfgh468";
        System.out.println(evenpairs(str));

    }

    private static boolean evenpairs(String str) {
        for(int i=0;i<str.length()-1;i++)
        {
            if(Character.isDigit(str.charAt(i))&&Character.isDigit(str.charAt(i+1)))
            {
                if(str.charAt(i)%2==0 && str.charAt(i+1)%2==0)
                    return true;
            }
        }
        return false;
    }
}
