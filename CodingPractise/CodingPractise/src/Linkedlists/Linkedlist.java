package Linkedlists;

public class Linkedlist {

    Node head;
    Node insertAtBeginning(int x)
    {
        Node node = new Node();
        node.data = x;
        node.next = null;
        if(head == null)
        {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
        return node;
    }

    public void show()
    {
        Node n = head;
        while(n.next!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }


    public void deleteNodeshavinggreatervaluethanright() {
        Node dummy = new Node();
        dummy.data = 0;
        dummy.next = head;
        Node current = dummy;
        Node maxNode = head;
        int maxValue = head.data;

        while (current.next != null && current.next.next != null) {
            if (current.next.next.data < maxValue) {
                current.next = current.next.next;
            } else {
                maxValue = current.next.next.data;
                current = current.next;
            }
        }

    }

    public Node deleteXNode(int x)
    {
        Node n=head;
        int count=1;
        if(x==1){
            head = head.next;
            return head;
        }
        else {
            while (n.next != null) {
                if (count == x-1) {
                 n.next = n.next.next;
                        break;
                }
                n = n.next;
                count++;
            }
        }
        return n;
    }
}
