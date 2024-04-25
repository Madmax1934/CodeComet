package org.example.javadesignpatterns.factorypattern;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("WIndows specifications");
    }
}
