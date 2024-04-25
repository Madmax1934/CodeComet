package ArrayPractise;

public class Surround1s {
    public static void main(String[] args) {
        int matrix[][]= {{1, 0, 0},
                {1, 1, 0},
                {0, 1, 0}};
        int n= matrix.length;
        int m=matrix[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==1)
                {
                    int zeroescount = countzeroesaround(matrix,i,j);
                    if(zeroescount%2==0)
                        count++;
                }
            }

        }
        //System.out.println("Number of such 1's = "+count);
    }

    private static int countzeroesaround(int[][] matrix, int i, int j) {
        int rows= matrix.length;
        int cols=matrix[0].length;
        int count = 0;
        int [][]directions = {
                {-1,-1},{-1,0},{-1,1},
                {0,-1},{0,0},{0,1},
                {1,-1},{1,0},{1,1}
        };

        for(int[] dir:directions)
        {
            int newrow = i + dir[0];
            int newcol = j + dir[1];
            if(newrow >=0 && newrow<rows && newcol>=0 && newcol<cols && matrix[newrow][newcol]==0){
                count++;
            }
        }
        return count;
    }
}
