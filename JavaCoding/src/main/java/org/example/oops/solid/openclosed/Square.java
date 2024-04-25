package org.example.oops.solid.openclosed;

public class Square implements Shape{
    int side=5;
    @Override
    public void calculateArea() {
        System.out.println("Area= "+(side*side));
    }
}
