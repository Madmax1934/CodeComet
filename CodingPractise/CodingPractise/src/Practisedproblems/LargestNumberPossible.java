package Practisedproblems;

public class LargestNumberPossible {
    public static void main(String[] args) {
        int N = 3, S =20;
        System.out.println(findLargest(N,S));
    }

    private static String findLargest(int N, int S) {
        String d = "";
        while(N-->0){
            d+='9';
        }
        int sum=calcualteSum(d);
        return findS(S,sum,d);
    }

    private static int calcualteSum(String d) {
        int largeNdigitnumber = Integer.parseInt(d);
        int temp = largeNdigitnumber;
        int sum=0,i=1;
        while(temp>0)
        {
            sum+=(temp%10);
            temp/=10;
        }
        return sum;
    }

    private static String findS(int s, int sum, String d) {
        if(s==sum)
            return d;
        else if(s>sum)
            return String.valueOf(-1);
        else{
            StringBuffer sb = new StringBuffer(d);
            sb.delete(sb.length()-1,sb.length());
            sum = calcualteSum(sb.toString());
            findS(s,sum,sb.toString());
        }
       return d;
    }
}
