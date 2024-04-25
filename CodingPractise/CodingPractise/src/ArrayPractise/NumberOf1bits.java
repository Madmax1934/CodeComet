package ArrayPractise;

public class NumberOf1bits {
    public static void main(String[] args) {
        int n=6;
        String res = setBits(n);
        StringBuffer sb = new StringBuffer(res);
        System.out.println(sb.reverse());
    }

    private static String setBits(int x)
    {
        String str = "";
        int ct =0;
        while(x!=0) {
            str+= x%2;
            if(x%2==1)
                ct++;
            x = x/2;

        }

       return str;
    }
}
