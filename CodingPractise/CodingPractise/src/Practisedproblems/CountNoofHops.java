package Practisedproblems;

public class CountNoofHops {
    public static void main(String[] args) {
        int n=4;
        System.out.println(countways(n));
    }

    private static long countways(int n) {
        if(n<=0)
            return 0;
        int sum = 0;
        int count=0;
        for(int i=1;i<=3;i++)
        {
            sum=i;
            for(int j=i;(n-j)>=0;j++)
            sum += n-j;
            if(sum==n)
                count++;
        }
        return 1+countways(n-1);
    }
}
