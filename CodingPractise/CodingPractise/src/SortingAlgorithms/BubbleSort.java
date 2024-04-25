package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=5;
        arr[1]=2;
        arr[2]=16;
        arr[3]=3;
        arr[4]=35;

        for(int i=arr.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //print after sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
