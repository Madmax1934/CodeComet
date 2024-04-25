package org.example.generics;

import java.io.Serializable;

public class Printer<T> {
    T fieldname;

    public Printer(T fieldname)
    {
        this.fieldname=fieldname;
    }

    public void print()
    {
        System.out.println(fieldname);
    }

    @Override
    public String toString() {
        return "Printer{" +
                "fieldname=" + fieldname +
                '}';
    }
}
