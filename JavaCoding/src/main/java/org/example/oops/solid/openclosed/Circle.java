package org.example.oops.solid.openclosed;

public class Circle implements Shape{
    int rad=7;
    @Override
    public void calculateArea() {
        System.out.println("Area= "+(22/7)*rad*rad);
    }
}
