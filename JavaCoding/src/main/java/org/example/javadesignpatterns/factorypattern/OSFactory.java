package org.example.javadesignpatterns.factorypattern;

public class OSFactory{
    public OS getInstance(String str)
    {
        if(str == "windows")
        {
            return new Windows();
        }
        else if(str == "Ios")
        {
            return new IOS();
        }
        else
            return new Android();
    }
}
