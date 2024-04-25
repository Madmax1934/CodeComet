package Practisedproblems;

public class FindFirstSetBit {
    public static void main(String[] args) {
        int n=12;
        System.out.println(findfirstsetBit(n));
    }

    private static int findfirstsetBit(int n) {
        StringBuffer sb = new StringBuffer();
        int temp = n;
        while(temp>0)
        {
            sb.append(temp%2);
            temp/=2;
        }

        return sb.indexOf("1")+1;
    }
}
