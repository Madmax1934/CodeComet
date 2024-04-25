package org.example.javadesignpatterns.factorypattern;

//the Factory Pattern is a creational design pattern that abstracts the process of object creation.
// It allows you to create objects without specifying their exact types, delegating the responsibility to
// subclasses or specialized factory classes.
// This abstraction promotes flexibility and code maintainability.
public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("Android");
        System.out.printf("Object created for ");
        os.spec();

    }
}
