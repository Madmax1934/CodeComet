package org.example.oops.solid;

public class SingleResponsibility {
    public static void main(String[] args) {
        //perform operations class is doing add,diff,multiply three functionalities. we need to seggregrate them into
        //different classes.
        PerformOperations performOperations = new PerformOperations();
        Addn.add();
        Subn.substract();
        Multn.multiply();
    }
}
