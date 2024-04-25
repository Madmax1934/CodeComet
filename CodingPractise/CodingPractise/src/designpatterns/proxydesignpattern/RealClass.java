package designpatterns.proxydesignpattern;

public class RealClass implements Subject{
    public void method()
    {
        System.out.println("I am in a real class and rest all are proxies");
    }
}
