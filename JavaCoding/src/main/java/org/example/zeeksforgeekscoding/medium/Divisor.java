package org.example.zeeksforgeekscoding.medium;

public class Divisor {
    public static void main(String[] args) {
        int num1=18;
        int num2 = 12;
        System.out.println("result= "+divisor(num1,num2));
    }

    private static int divisor(int num1, int num2) {
        if(num1==0||num2==0)
        {
            return num1+num2;
        }
        return divisor(num2,num1%num2);
    }
}
