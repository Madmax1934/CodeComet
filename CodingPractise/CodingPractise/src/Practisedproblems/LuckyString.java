package Practisedproblems;

public class LuckyString {
    public static void main(String[] args) {
        String S= "Strings";
        //System.out.println(isItlucky(S));
        int N= 4;
        long sum =0;
        for(int i=1;i<=N;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(N%j==0)
                {
                    sum+=j;
                }
            }
        }
        System.out.println(sum);
        //return sum;
    }

    private static String isItlucky(String s) {
        String result = "-404";
        StringBuffer sb = new StringBuffer(s);
        if(sb.length()%2==0)
            return sb.toString();

        else
        {
            sb.deleteCharAt(sb.length()/2);
            isItlucky(sb.substring(0,sb.length()/2));
            isItlucky(sb.substring(sb.length()/2,sb.length()));
        }
        result = sb.toString();
        return result;
    }
}
