package Practisedproblems;

public class checkBST {
    public static void main(String[] args) {
        Node root=null;
        root=insert(root,2);
        insert(root,1);
        insert(root,3);

        if(isBSTNode(root)==1)
            System.out.println("is Practisedproblems.BST");
        else
            System.out.println("Is not a Practisedproblems.BST");
    }

    public static Node insert(Node node,int data)
    {
        if(node==null) return new Node(data);

        if(data<node.key)
            node.left = insert(node.left,data);
        else
            node.right = insert(node.right,data);

        return node;
    }

    public static int maxValue(Node node)
    {
        if(node==null)
            return Integer.MIN_VALUE;
        int value = node.key;
        int leftmax = maxValue(node.left);
        int rightmax = maxValue(node.right);
        return Math.max(value,Math.max(leftmax,rightmax));
    }
    static int isBSTNode(Node node)
    {
        if(node==null) return 1;

        if(node.left!=null && maxValue(node.left)>node.key)
            return 0;

        if(node.right!=null && maxValue(node.right)<node.key)
            return 0;

        if(isBSTNode(node.left)!=1 || isBSTNode(node.right)!=1)
            return 0;
        return 1;
    }
}
