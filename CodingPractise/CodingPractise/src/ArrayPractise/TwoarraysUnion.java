package ArrayPractise;

import java.util.*;
import java.util.stream.Collectors;

public class TwoarraysUnion {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[]= {1,2,3};
        int n=5,m=3;

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.stream(a).boxed().collect(Collectors.toSet()));
        set1.addAll(Arrays.stream(b).boxed().collect(Collectors.toSet()));
        System.out.println(set1.size());

    }
}
