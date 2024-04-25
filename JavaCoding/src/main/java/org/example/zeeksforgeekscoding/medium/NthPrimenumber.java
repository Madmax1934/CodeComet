package org.example.zeeksforgeekscoding.medium;

public class NthPrimenumber {
    public static void main(String[] args) {
        int n=16;
        System.out.println(nthprime(n));
    }

    private static int nthprime(int n) {
        int num = 2;
        while(n>0) {

            if (isprime(num)) {
                System.out.println("current prime = "+num+" and current count = "+n);
                n--;
            }
            num+=1;
        }
        return num-1;
    }

    private static boolean isprime(int num) {
        if(num<=1)
            return false;
        if(num==2)
        {
            return true;
        }
        if(num%2==0)
        {
            return false;
        }

        double upper = Math.sqrt(num)+1;

        for(int i=3;i<upper;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
