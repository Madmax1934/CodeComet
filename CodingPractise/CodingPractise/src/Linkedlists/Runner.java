package Linkedlists;

import java.util.HashMap;

class LinkedListDemo {
    Node head;

    //Inserting node at the end
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    //inserting node at the beginning
    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    //Inserting in the middle

    public void insertInMiddle(int data, int index) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    //deleting at the specified index
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else if (index == 4) {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n.next = null;

        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("deleted n1 node : " + n1.data);
        }
    }

    // get the length of linked list
    public int getCount() {
        Node n = head;
        int count=0;
        while(n.next!=null)
        {
            count++;
            n=n.next;
        }
        return count+1;
    }

    //display linked list
    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


    //checks whether its a circular linked list
    public boolean isCircular() {
        Node n= head;
        while(n.next!=head && n.next!=null)
        {
          n=n.next;
        }
        return n.next==head?true:false;
    }

    public int findMiddleele() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public Node reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // Save the next node
            current.next = prev;  // Reverse the pointer

            // Move the pointers forward
            prev = current;
            current = next;
        }

        return prev;  // The new head of the reversed list
    }
    public boolean detectLoop()
    {
        if (head == null || head.next == null) {
            return false; // No loop if the list is empty or has only one node
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move one step at a time
            fast = fast.next.next;  // Move two steps at a time

            if (slow == fast) {
                return true; // Loop detected
            }
        }

        return false;
    }

    public int getNthfromlast(int i) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Node n = head;
        int count = 0;
        while(n.next!=null)
        {
            count++;
            hm.put(count,n.data);
            n=n.next;
        }
        count+=1;
        hm.put(count,n.data);
        return (i>count)?-1:hm.get(count-(i-1));
    }
}

public class Runner {
    public static void main(String[] args) {
        LL ll= new LL();
        ll.insertNodeAtbeginning(10);
        for(int i=20;i<=60;i+=10){
            ll.insertNodeAtEnd(i);
        }

//        ll.insertNodeInMiddle(90,3);
//        ll.deletefirstNode();
//        ll.deleteInMiddle(2);
//        ll.deleteAtEnd();
//        ll.reverseTheList();
//        ll.display();
        LinkedListDemo lld = new LinkedListDemo();
        for(int i=20;i<=60;i+=10){
            lld.insert(i);
        }
        System.out.println(lld.detectLoop());
        System.out.println(lld.getNthfromlast(1));
    }
}
