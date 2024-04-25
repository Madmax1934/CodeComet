package BinaryTrees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class IntersectingBSTs {
    static ArrayList<Integer> alist1 = new ArrayList<>();
    static ArrayList<Integer> alist2 = new ArrayList<>();

    static Set<Integer> set = new HashSet<>();
    public static ArrayList<Integer> findCommon(Node root1, Node root2)
    {

        //code here
        traverseBST1(root1);
        traverseBST2(root2);

        for (Integer element : alist1) {
            // Check if the element is also in the second ArrayList
            if (alist2.contains(element)) {
                set.add(element);
            }
        }

        return (ArrayList<Integer>) set.stream().sorted().toList();
    }

    public static void traverseBST1(Node root)
    {
        if(root.left!=null)
            traverseBST1(root.left);
        alist1.add(root.data);
        if(root.right!=null)
            traverseBST1(root.right);
    }

    public static void traverseBST2(Node root)
    {
        if(root.left!=null)
            traverseBST2(root.left);
        alist2.add(root.data);
        if(root.right!=null)
            traverseBST2(root.right);
    }
}
