package Linkedlists;

public class LL {

    Node head;

    Node insertNodeAtbeginning(int x)
    {
        Node n = new Node();
        n.data = x;
        n.next = null;
        if(head==null)
        {
            head=n;
        }
        else{
            n.next=head;
            head= n;
        }
        return n;
    }

    Node insertNodeAtEnd(int x)
    {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;
        Node n = head;
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next = newNode;
        return n;
    }

    Node insertNodeInMiddle(int x,int index)
    {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;
        Node n= head;
        for(int i=0;i<index-1;i++)
        {
            n=n.next;
        }

        newNode.next = n.next;
        n.next = newNode;
        return n;
    }

    //Deletions

    Node deletefirstNode()
    {
        Node n = head;
        if(head==null)
            return new Node();
        else{
            head = n.next;
            n.next = null;
        }
        return n;
    }

    Node deleteInMiddle(int index)
    {
        Node n= head;
        for(int i=0;i<index-1;i++)
        {
            n=n.next;
        }
        n.next = n.next.next;
        return n;
    }

    Node deleteAtEnd()
    {
        Node n=head;
        while(n.next.next!=null)
        {
            n=n.next;
        }
        n.next=null;
        return n;
    }

    //displaying the linked list
    public void display()
    {
        Node n =head;
        while(n!=null)
        {
            System.out.print(n.data+"->");
            n=n.next;
        }
    }

    int getListlength()
    {
        int count=0;
        Node n = head;
        while(n!=null)
        {
            count++;
        }
        return count;
    }
    public void reverseTheList() {
        Node temp = head;
        Node n = head;
        while(n.next!=null)
        {
            n=n.next;
        }
        Node tail = n;
        head = tail;
        tail=temp;
        Node after = temp.next;
        Node before = null;

        for(int i=0;i<getListlength();i++)
        {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }

    }
}
