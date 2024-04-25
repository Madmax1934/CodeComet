package org.example.oops.solid.openclosed;

public class Rectangle implements Shape{

    int length=10;
    int width=5;
    @Override
    public void calculateArea() {
        System.out.println("Area "+(length*width));
    }
}
