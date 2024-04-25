package ArrayPractise;

import java.util.HashMap;

public class Minnoofjumps {
    public static void main(String[] args) {
        int n = 11;
        int arr[] =  {2,3,2,3,5};//{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int N= arr.length;
        /*int count=0,i=0;
        do{
            i+=arr[i];
            count++;
        }while(i<n);
        System.out.println(count);

         */
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        for(int i=1;i<=N;i++)
        {
            if(hm.containsKey(i))
            {
                arr[i-1]=hm.get(i);
            }
            else{
                arr[i-1]=0;
            }
        }

        System.out.println("The array of freqs from 1 to N is: ");
        for(int i=0;i<N;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("The end");
        if (n <= 1) {
            System.out.println(0);; // No jumps needed for an array of size 0 or 1

        }

        if (arr[0] == 0) {
            System.out.println(-1); // Cannot move through the first element

        }

        int maxReach = arr[0]; // Maximum index reachable from the current position
        int steps = arr[0];    // Number of steps that can be taken from the current position
        int jumps = 1;          // Minimum number of jumps

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                System.out.println(jumps); // Reached the end of the array
                break;
            }

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                if (i >= maxReach) {
                    System.out.println(-1);// Cannot progress further
                    break;
                }
                steps = maxReach - i;
                jumps++;
            }
        }

        System.out.println(-1);
    }
}
