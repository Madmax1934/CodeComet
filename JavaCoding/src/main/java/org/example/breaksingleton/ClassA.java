package org.example.breaksingleton;

public class ClassA {
    public static void main(String[] args) {
        int[] array={0,1,1,0,1,0,0,0,1,1,0,0,1,1,1};

        String str = new String();
        int mid = array.length/2;
        int count=0;
        for(int i=0;i<mid;i++)
        {
            if(array[i]==1)
            {
                array[i]=0;
                count++;
            }

        }
        for(int i=mid;i< array.length;i++)
        {
            if(array[i]==0)
                array[i]=1;
        }

        int min =0,max=1;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]==max){
                int temp=array[i];
                array[array.length-i]= temp;
            }

        }
//        for(int i=0;i< array.length;i++)
//        {
//            for(int j=i+1;j< array.length;j++)
//            {
//                if(array[i]<array[j])
//                {
//                    int temp = array[i];
//                    array[i]=array[j];
//
//                }
//            }
//        }
    }
}
