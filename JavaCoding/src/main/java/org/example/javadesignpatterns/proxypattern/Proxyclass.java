package org.example.javadesignpatterns.proxypattern;

public class Proxyclass extends Realclass{

    public void display()
    {
        System.out.println("This is the proxy implementation calling real class implementation");
        super.display();
    }
}
