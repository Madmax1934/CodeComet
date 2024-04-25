package designpatterns.Adapterpattern;

//The adapter design pattern is stuctural design pattern.
//this design pattern that allows objects with incompatible interfaces to collaborate with
//one another. It uses inheritance and composition to enable objects with incompatible interfaces
//to collaborate with one another.
//To do that, it creates a middle-layer class that serves as a translator
public class School {
    public static void main(String[] args) {
        Pen p = new Pilotadapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("I am too tired to write my assignment");
    }
}
