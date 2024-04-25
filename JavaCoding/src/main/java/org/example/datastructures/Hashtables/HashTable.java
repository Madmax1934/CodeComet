package org.example.datastructures.Hashtables;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public int hash(String key) {
        int hash=0;
        char[] charr = key.toCharArray();
        for(int i=0;i< charr.length;i++)
        {
            int asciivalue = charr[i];
            hash=(hash+asciivalue*23)% dataMap.length;
        }
        return hash;
    }

    class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable()
    {
        dataMap = new Node[size];
    }

    public void printTable()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(i+": ");
            Node temp=dataMap[i];
            while(temp!=null)
            {
                System.out.println("Key= "+temp.key+", Value= "+temp.value);
                temp=temp.next;
            }
        }
    }

}
