package Practisedproblems;

import java.util.ArrayList;

public class RotateBits {
    public static void main(String[] args) {
        int N = 28, D=2;
        System.out.println(rotatebits(N,D));
    }

    private static ArrayList<Integer> rotatebits(int N, int D) {
        ArrayList<Integer> alist=new ArrayList<>();
        StringBuffer sb = convertToBin(N);
        sb=rotateleft(sb,D);
        int dec = converttoDec(sb);

        StringBuffer sb1 = convertToBin(N);
        sb=rotateright(sb1,D);
        int decimal = converttoDec(sb);

        alist.add(dec);
        alist.add(decimal);
        return alist;
    }

    private static StringBuffer rotateright(StringBuffer sb1, int d) {
        sb1.insert(0,sb1.substring(sb1.length()-2,sb1.length()),0,d);
        sb1.delete(sb1.length()-2,sb1.length());
        return sb1;
    }

    private static StringBuffer rotateleft(StringBuffer sb, int d) {
        while(d>0)
        {
            sb.append(0);
            d--;
        }
        sb.delete(0,d);
        return sb;
    }

    private static int converttoDec(StringBuffer sb) {
        int sum =0;
        for(int i=sb.length()-1;i>=0;i--)
        {
            int dig = Integer.parseInt(String.valueOf(sb.charAt(i)));
            sum+=(dig)*(int)Math.pow(2,i);
        }
        return sum;
    }

    private static StringBuffer convertToBin(int n) {
        StringBuffer sb = new StringBuffer();
        while(n>0)
        {
            sb.append(n%2);
            n/=2;
        }
        sb.reverse();
        return sb;
    }
}
