package ArrayPractise;

public class Completestaircase {
    public static void main(String[] args) {
        int n=8;
        int s=0,i=0;
        while(s<=n)
        {
            i++;
            s = (i*(i+1))/2;

        }
        if(s>n)
        {
            i--;
        }
        System.out.println(i+" complete rows");
    }
}
