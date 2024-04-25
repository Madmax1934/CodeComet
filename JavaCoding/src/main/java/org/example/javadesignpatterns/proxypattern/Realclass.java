package org.example.javadesignpatterns.proxypattern;

public class Realclass implements Subject{
    @Override
    public void display() {
        System.out.println("This is the real implementation");
    }
}
