package org.example.javadesignpatterns.prototype;
//The Prototype Design Pattern is a creational pattern that enables the creation of new objects by copying
// an existing object. Prototype allows us to hide the complexity of making new instances from the client.
class Cloneclass implements Prototype{


    @Override
    public Prototype clone() {

        return new Cloneclass();
    }
}

class MainClone{
    public static void main(String[] args) {
    Cloneclass cc = new Cloneclass();
    System.out.println(cc.hashCode());
    cc.clone();
    System.out.println("After Cloning the object..");
    System.out.println(cc.clone().hashCode());

    }
}
