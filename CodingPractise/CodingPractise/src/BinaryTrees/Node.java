package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;

public class Node {
    Node left, right;
    int data;

    public Node(int value)
    {
        this.data = value;
        left = null;
        right = null;
    }

    public void insert(int x)
    {
        if(x<=data)
        {
            if(left==null)
            {
                left = new Node(x);
            }
            else{
                left.insert(x);
            }
        }
        else{
            if(right == null)
            {
                right = new Node(x);
            }
            else{
                right.insert(x);
            }
        }
    }

    public boolean contains(int val)
    {
        if(val == data)
            return true;
        else if(val<data){
            if(left == null)
                return false;
            else{
               return left.contains(val);
            }
        }
        else{
            if(right==null)
                return false;
            else{
               return right.contains(val);
            }
        }
    }

    public void printInorderTraversal(){
        if(left!=null)
            left.printInorderTraversal();
        System.out.println(data);
        if(right!=null)
            right.printInorderTraversal();
    }

    public void printLeftViewOfTree(){
        if(left!=null)
            left.printLeftViewOfTree();
        System.out.println(data);
    }

    ArrayList<Integer> list = new ArrayList<>();
    public void findkthLargestele(Node root,int k)
    {
      
    }

    public int heightBT(Node root)
    {
       if(root==null) return -1;
       else{
           int leftheight = heightBT(left);
           int rightheight = heightBT(right);
           return Math.max(leftheight,rightheight)+1;
       }
    }
    
}

class Main{
    public static void main(String[] args) {
        ArrayList<Node> list = new ArrayList<>();
        list.add(new Node(4));
        list.add(new Node(2));
        list.add(new Node(9));
        for(Node i:list)
        System.out.println(i.data);

        Node n = new Node(3);
//        System.out.println("Printing left view Of binary tree: ");
//        n.printLeftViewOfTree();



    }
}
