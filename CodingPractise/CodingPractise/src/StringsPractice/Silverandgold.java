package StringsPractice;

public class Silverandgold {
    public static void main(String[] args) {
        int N=8;
        String s= "10010100";
        System.out.println(flipcoins(N,s));

    }

    private static String flipcoins(int N, String s) {
        char[] sarr = s.toCharArray();
        String res="Yes";
        for(int i=0;i<N;i++)
        {
            if(sarr[i]=='0')
            {
                if(sarr[i-1]=='1'||sarr[i+1]=='1')
                {
                    sarr[i]='1';
                }
                else {
                    res="No";
                    break;
                }
            }
        }
        return res;
    }
}
