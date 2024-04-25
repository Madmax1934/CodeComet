package SDEProblems;

import java.util.ArrayList;

public class BooleanMatrix {
    public static void main(String[] args) {
        int M[][] = {{1, 1, 0, 1},{1, 0, 0, 1},{1, 1, 0, 1}};
        int r = 3;
        int c = 4;
        System.out.println(uniqueRow(M,r,c));
    }

    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c)
    {
        //add code here.
        ArrayList<Integer> alist = new ArrayList<>();
        ArrayList<ArrayList<Integer>> nestedList = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                alist.add(a[i][j]);
            }
            if(!nestedList.contains(alist)) {
                nestedList.add(alist);
                alist.clear();
            }
        }
        return nestedList;
    }
}
