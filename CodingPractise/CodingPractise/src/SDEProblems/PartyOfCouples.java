package SDEProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PartyOfCouples {
    public static void main(String[] args) {
        int n=5;
      int a[] = {1,2,3,2,1};
        System.out.println(findSingle(n,a));
    }

    public static int findSingle(int N, int arr[]){
      HashMap<Integer,Integer> hm = new HashMap<>();
      int res=0;
      for(int i=0;i<N;i++)
      {
          hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
      }
      for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
          if(entry.getValue()==1)
              res=entry.getKey();
      }
      return res;
    }
}
