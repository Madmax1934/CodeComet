package org.example.Misc;

//Input: lists = [[1,4,5],[1,3,4],[2,6]]
//Output: [1,1,2,3,4,4,5,6]
public class MyLinkedList {
    Node head =new Node(1);


    private int value;
    Node next;
    int count=0;
    public void printList() {

        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public Node getNode()
    {
        Node temp=head;
        System.out.println(temp.data);
        return temp;
    }

    public void deleteoddnode() {
        Node temp=head;
        Node prev=null;
        Node curr=head;

        while(temp!=null) //1,3
        {
            if(temp.data%2!=0)
            {
                if(temp==head) {
                   head = head.next;
                }
                else{

                }
            }

            temp=temp.next;
            System.out.println("current node value: "+temp.data);
        }

    }

    public int findlength() {
        Node temp=head;

        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
//      public MyLinkedList(int value)
//      {
//          this.value=value;
//          this.next=null;
//      }

    public void append(int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
    }
}
