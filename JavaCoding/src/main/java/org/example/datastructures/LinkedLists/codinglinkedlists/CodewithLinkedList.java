package org.example.datastructures.LinkedLists.codinglinkedlists;

public class CodewithLinkedList {
    public static void main(String[] args) {
        MyLinkedlist myLinkedlist=new MyLinkedlist(1);
        myLinkedlist.appending(3);
        myLinkedlist.appending(3);
        myLinkedlist.appending(4);
        myLinkedlist.appending(5);
        myLinkedlist.printl();

        myLinkedlist.reverseList();
        System.out.println("After Reversing the linked list: ");
        myLinkedlist.printl();
        System.out.println("deleting odd nodes: ");
        myLinkedlist.deleteOddNodes();
        myLinkedlist.printl();
        System.out.println("The middle value is: "+myLinkedlist.findMiddleNode().value);
        System.out.println(myLinkedlist.hasloop());
        System.out.println("The kth node form the list is: "+myLinkedlist.findKthnodefromend(1).value);
        //myLinkedlist.partitionlist(3);

        System.out.println("Before removing dups: ");
        myLinkedlist.printl();
        myLinkedlist.removeDuplicates();
        System.out.println("After removing duplicates: ");
        myLinkedlist.printl();

    }
}
