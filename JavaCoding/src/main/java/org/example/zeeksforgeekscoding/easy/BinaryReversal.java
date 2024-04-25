package org.example.zeeksforgeekscoding.easy;

public class BinaryReversal {
    public static void main(String[] args) {
        int num=47;
        System.out.println("Binary reversed value =" +binaryrev(num));
    }

    private static int binaryrev(int num) {
        String s="";
        int temp=num;
        while(temp>0)
        {
            s+=temp%2;
            temp/=2;
        }
        while(s.length()!=8)
        {
            s+="0";
        }
        System.out.println("String = "+s);
        return converttodec(s);
    }

    private static int converttodec(String s) {
        int sum=0;
        int x=0;
        int prod=1;
        int size=s.length()-1;
        for(int i=0;i<s.length()&size>=0;i++)
        {
            x=(int)Math.pow(2,size);
            System.out.println("x= "+x);
            prod= x * Integer.parseInt(Character.toString(s.charAt(i)));
            sum+=prod;
            size--;
        }

        return sum;
    }
}
