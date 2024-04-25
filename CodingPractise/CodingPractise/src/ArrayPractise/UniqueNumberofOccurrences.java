package ArrayPractise;
import java.util.*;
import java.util.HashMap;

public class UniqueNumberofOccurrences {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int flag=0;
        int n=6;
        int arr[]=new int[n];
        HashMap<Integer,Integer> hm = new HashMap<>();
        System.out.println("enter the array elements: ");
        for(int i=0;i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
            System.out.println("element inputted");
        }
                for(int i:arr)
                {
                        hm.put(i,hm.getOrDefault(i,0)+1);
                }

                HashSet<Integer> hashset = new HashSet<>(hm.values());

                if(hashset.size()< hm.size())
                    System.out.println("hs size: "+hashset.size()+"; hm size: "+hm.size());
                if(hashset.size()==hm.size())
                    System.out.println("true");

    }
}
