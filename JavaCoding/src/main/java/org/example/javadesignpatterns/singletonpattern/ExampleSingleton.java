package org.example.javadesignpatterns.singletonpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExampleSingleton {

    private static ExampleSingleton instance;
    private ExampleSingleton()
    {

    }

    public static ExampleSingleton getInst()
    {
        if(instance==null)
        {
            instance= new ExampleSingleton();
        }
        return instance;
    }
}

class Main{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ExampleSingleton obj = ExampleSingleton.getInst();
        ExampleSingleton dup = ExampleSingleton.getInst();
        System.out.println("original instance "+obj.hashCode());
        System.out.println("duplicate instance: "+dup.hashCode());
        // Breaking Singleton pattern using Reflection API
        Class<?> examplesingleton = Class.forName("org.example.javadesignpatterns.singletonpattern.ExampleSingleton");
        Constructor<ExampleSingleton> constructor = (Constructor<ExampleSingleton>) examplesingleton.getDeclaredConstructor();
        ExampleSingleton newInstance = constructor.newInstance();
        System.out.println("New Instance: "+newInstance.hashCode());
    }
}
