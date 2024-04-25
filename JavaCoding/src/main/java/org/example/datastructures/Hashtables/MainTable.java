package org.example.datastructures.Hashtables;

public class MainTable {
    public static void main(String[] args) {
        HashTable myHashtable = new HashTable();
        String key="sursasdfghjk";
        myHashtable.printTable();
        System.out.println(myHashtable.hash(key));
    }
}
