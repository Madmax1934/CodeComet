package ArrayPractise;

public class ShuffleIntegers {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int b[]= arr.clone();
        int n=b.length;
        int k=0;
        for(int i=0,j=n/2;i<n/2&&j<n;i++,j++)
        {
            arr[k]=b[i];
            k++;
            arr[k]=b[j];
            k++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
