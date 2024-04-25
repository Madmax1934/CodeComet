package org.example.generics;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<String> printer = new Printer<>("Twenty");
        printer.print();

        genericmethod("Something",printer);
    }

    //generic method
    public static <T, V> void genericmethod(T field, V otherfield)
    {
        System.out.println("printing method "+field+", "+otherfield);
    }
}
/*
2. What Is Type Erasure?
Type erasure can be explained as the process of enforcing type constraints only at compile time and discarding the element type information at runtime.

For example:
public static  <E> boolean containsElement(E [] elements, E element){
    for (E e : elements){
        if(e.equals(element)){
            return true;
        }
    }
    return false;
}

The compiler replaces the unbound type E with an actual type of Object:

public static  boolean containsElement(Object [] elements, Object element){
    for (Object e : elements){
        if(e.equals(element)){
            return true;
        }
    }
    return false;
}
Copy
Therefore the compiler ensures type safety of our code and prevents runtime errors
 */