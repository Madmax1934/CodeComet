package org.example.datastructures.LinkedLists.codinglinkedlists;

import org.example.datastructures.LinkedLists.Node;

import java.util.HashSet;
import java.util.Set;

public class MyLinkedlist {

    public Node head;
    public Node tail;
    public int length;

    public MyLinkedlist(int value)
    {
        Node mynode = new Node(value);
        head=mynode;
        tail=mynode;
        length=1;
    }

    public void appending(int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
       else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printl() {
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            System.out.println(temp.value);
        }
    }

    public Node findMiddleNode() {
        int mid=length/2;
        Node temp=head;
        for(int i=0;i<mid;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

    public boolean hasloop() {
        return  (tail.next!=null)?true:false;
    }

    public Node findKthnodefromend(int i) {
        if(length==0||i>length)
        {
            return null;
        }
        else
        {
            int x=length-i;
            Node temp=head;
            for(int j=0;j<x;j++)
            {
                temp=temp.next;
            }
            return temp;
        }
    }

    public void partitionlist(int a) {
        Node temp=head;
        Node itr = head;
        Node before=null;
        while(temp.next!=null)
        {
            if(temp.value<a)
            {
                before=temp;
                temp=temp.next;

            }
            else{
                before.next = temp.next;
                temp.next=null;
                tail.next=temp;
                tail=temp;
            }
        }


    }

    public void removeDuplicates() {
        Set<Integer> set = new HashSet<>();
        Node current = head;
        Node prev=null;
        while (current != null) {
            int currval = current.value;

            if(set.contains(currval))
            {
                prev.next=current.next;
            }
            else{
                set.add(currval);
                prev=current;
            }
            current=current.next;

        }
    }

    public void deleteOddNodes() {
        Node dummy = new Node(0);
        dummy.next=head;
        Node prev=dummy;
        Node curr=head;
        while(curr!=null)
        {
            if(curr.value%2!=0)
            {
                prev.next=curr.next;
                System.out.printf(" deleting ,"+curr.value);
            }else{
                prev=curr;
            }
            curr=curr.next;
        }
    }

    public void reverseList() {
        Node temp=head;
        head=tail;
        tail = temp;
        Node before =null;
        Node after = temp.next;

        for(int i=0;i<length;i++)
        {
            after = temp.next;
            temp.next=before;
            before = temp;
            temp=after;
        }
    }
}
