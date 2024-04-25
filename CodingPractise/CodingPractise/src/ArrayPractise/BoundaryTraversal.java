package ArrayPractise;

import java.util.ArrayList;

public class BoundaryTraversal {
    public static void main(String[] args) {
        int N =4,M=4;
        int matrix[][] = {{1, 2, 3, 4},{5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}};

        System.out.println(boundaryTraversal(matrix,N,M));
    }

    private static ArrayList<Integer> boundaryTraversal(int[][] matrix, int n, int m) {
        ArrayList<Integer> alist = new ArrayList<>();
        int i=0,j=0;
        for(j=0; j<m ;j++)
        {
          alist.add(matrix[i][j]);
        }
        for(i=1,j=m-1;i<n;i++)
        {
            alist.add(matrix[i][j]);
        }
        for(j=m-2,i=n-1; j>0 ;j--)
        {
            alist.add(matrix[i][j]);
        }
        for(i=n-1,j=0;i>0;i--)
        {
            alist.add(matrix[i][j]);
        }
        return alist;
    }

    static long inversionCount(long arr[], long N)
    {
        int invcount=0;
        // Your Code Here
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]>arr[j])
                {
                    invcount++;
                }
            }
        }
        return invcount;
    }
}
