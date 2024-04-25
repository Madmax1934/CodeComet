package org.example.oops;

public class Immutability {
    //for a class to be immutable:
    //1.All fields must be private
    //2.There can't be any setter methods
    //3.No getter methods can return a data field that is mutable
    // 3.1 If there is a getter method that returns an object, that object must be immutable.

    private int a;

    public Immutability(int x)
    {
        this.a=x;
    }

    public int get()
    {
        return this.a;
    }
}
