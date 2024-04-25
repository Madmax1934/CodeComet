package org.example.oops.solid.openclosed;

public class OpenClosedPrinciple {
    //OpenClosedPrinciple => Open for extension, but closed for modifications.
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea();
    }
}
