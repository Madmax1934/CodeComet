package ArrayPractise;

public class countnoofhops {
    public static void main(String[] args) {
        int tsum = 4;
        int possnos[] = {1,2,3};

        int count=0;
        for(int i=0;i<3;i++)
        {
            int sum=0;
            while(tsum-sum>0) {
                sum += possnos[i];
                if (sum == tsum) {
                    count++;
                    break;
                }
            }
        }


    }

    public static int recsum(int rem,int sum, int tsum)
    {
        sum+=recsum(tsum-sum,sum,tsum);
        return sum;
    }
}
