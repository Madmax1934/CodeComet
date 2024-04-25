package designpatterns.factorypattern;

public class Ios implements OS{
    @Override
    public void spec() {
        System.out.println("The most secure OS");
    }
}
