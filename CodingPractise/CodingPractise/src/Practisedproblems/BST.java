package Practisedproblems;

public class BST {
    public static void main(String[] args) {
        Node root = null;
        root = insert(root,25);
        insert(root,20);
        insert(root,15);
        insert(root,22);
        insert(root,35);
        insert(root,30);
        insert(root,45);
        insert(root,32);

        int sum =0;
        int flag = 0;
        int res = maxDifferenceBST(root,20);

        System.out.println("target node sum: "+res);

        //inorder(root);
    }
    public static Node insert(Node node,int data)
    {
        if(node==null)
            return new Node(data);
        if(data<node.key)
        {
            node.left= insert(node.left,data);
        }
        else if(data> node.key)
            node.right= insert(node.right,data);

        return node;
    }

    public static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(" " + node.key);
            inorder(node.right);

        }
    }

    public static int maxDifferenceBST(Node root,int target)
    {
        //Please code here

        int targetsum = search(root,target,0);
        int leafsum = minsum(root);
        return targetsum-leafsum;
    }
    public static int search(Node node,int target,int sum)
        {

            if(node==null) return -1;

            if(target>node.key)
            {
                search(node.right,target,sum+node.key);
                System.out.println(sum);
            }
            if(target< node.key)
            {
                search(node.left,target,sum+node.key);
                System.out.println(sum);
            }

            return sum;
        }

        public static int minsum(Node node)
        {
            if(node==null) return 0;
           if(node.left==null && node.right==null)
           {
               return node.key;
           }
           if(node.left==null)
               return node.key+minsum(node.right);
           if(node.right==null)
               return node.key+minsum(node.left);

           return Math.min(node.key+minsum(node.left),node.key+minsum(node.right));
        }


}

