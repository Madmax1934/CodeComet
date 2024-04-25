package org.example.Misc;


import org.example.datastructures.LinkedLists.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
       ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
       //ll.printList();

        ll.findlength();
       ll.deleteoddnode();
        ll.printList();

//        Input: lists = [[1,4,5],[1,3,4],[2,6]]
//Output: [1,1,2,3,4,4,5,6]

        MyLinkedList ll1=new MyLinkedList();
        ll1.append(1);
        ll1.append(4);
        ll1.append(5);
        MyLinkedList ll2=new MyLinkedList();
        ll2.append(1);
        ll2.append(3);
        ll2.append(4);
        MyLinkedList ll3=new MyLinkedList();
        ll3.append(2);
        ll3.append(6);

        List<MyLinkedList> nodelists = new ArrayList<MyLinkedList>();

        List<MyLinkedList> sortedlist = new ArrayList<MyLinkedList>();
        nodelists.add(ll1);
        nodelists.add(ll2);
        nodelists.add(ll3);

        List<String> stringList = List.of("catac","tomato","xyz");

        Iterator itr = stringList.iterator();


        while(itr.hasNext())
        {
            StringBuffer sb = new StringBuffer(String.valueOf(itr.next()));
            if(sb.reverse().equals(itr.next()))
            {
                System.out.println(itr.next());
            }

        }

//        for(MyLinkedList it:nodelists)
//        {
//            for(MyLinkedList it2:nodelists)
//            {
//                if(it.getNode().data<=it2.getNode().data)
//                {
//                    sortedlist.add(it);
//                }
//                else
//            }
//
//        }


    }

}
