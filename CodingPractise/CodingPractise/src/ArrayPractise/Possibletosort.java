package ArrayPractise;

import java.util.Arrays;

public class Possibletosort {
    public static void main(String[] args) {
        int N=5; int D=3;
        int[] A= {5,1,3,2,5};
        System.out.println(check(D,N,A));
    }

    public static boolean check(int D, int N, int []A)
    {
        int B[] = new int[N];
        System.arraycopy(A,0,B,0,N);
        Arrays.sort(B);
        String res="No";
        for(int i=0;i<N;i++)
        {
            int a= i;
            int b = (i+D)%N;
            swapit(a,b,A);
            if(Arrays.equals(B,A)){
                res="Yes";
                break;
            }
        }
        return res=="Yes"?true:false;
    }

    private static void swapit(int a, int b, int[] a1) {
        int temp = a1[a];
        a1[a]=a1[b];
        a1[b]=temp;
    }
}
