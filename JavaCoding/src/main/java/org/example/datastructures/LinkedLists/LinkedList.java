package org.example.datastructures.LinkedLists;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value)
    {
        Node newnode =new Node(value);
        head = newnode;
        tail = newnode;
        length=1;
    }

    public void printlist()
    {
        Node temp=head;
        while(temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value)
    {
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                length++;
            }
            temp.next = newNode;
            newNode.next = null;
            length++;
        }
    }

    public void removelast() {
        if(head.next==null||head==null)
        {
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            while (temp.next.next != null) {
                temp = temp.next;
                length++;
            }
            tail=temp;
            temp.next=null;
            length--;
        }

    }

    public void prepend(int i) {
        Node newNode = new Node(i);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
            length++;
        }
    }

    public void removefirst() {
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
    }

    public Node get(int index) {
        if(index<0 || index>=length)
        {
            return null;
        }
        else{
            Node temp=head;
            for(int i=0;i<index;i++)
            {
                temp=temp.next;
            }
            return temp;
        }
    }

    public boolean set(int index, int i) {
        Node temp = get(index);
        if(temp!=null)
        {
            temp.value=i;
            return true;
        }
        return false;
    }

    public void reverselinkedlist()
    {
        Node temp=head;
        head=tail;
        tail=temp;
        Node after = temp.next;
        Node before =null;
        System.out.println("length of linked list: "+length);
        for(int i=0;i<length;i++)
        {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
}

class Main{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(5);
        linkedList.append(6);
        //linkedList.removelast();
        linkedList.prepend(7);
        //linkedList.removefirst();

        int index=2;
        System.out.println("Node at index "+index+"= "+linkedList.get(index).value);
        System.out.println(linkedList.set(index, 9));
        linkedList.printlist();
        
        linkedList.reverselinkedlist();
        linkedList.printlist();


    }


}
