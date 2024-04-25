package designpatterns.proxydesignpattern;

public class Proxyclass extends RealClass{

    @Override
    public void method() {
        System.out.println("Hi! I am proxy class and I perform authentication checks");

        //checks if user is authentic or no and then calls realclass method if yes
        System.out.println("I am inside Proxy class calling super class:realclass method");
        super.method();
    }
}
