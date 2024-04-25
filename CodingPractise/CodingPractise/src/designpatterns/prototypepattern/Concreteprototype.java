package designpatterns.prototypepattern;

public class Concreteprototype implements Prototype{

    private String property;
    public Concreteprototype(String property){
        this.property = property;
        System.out.println(property+" invoked");
    }

    public void setProperty(String property) {
        this.property = property;
        System.out.println(property+" invoked");
    }

    @Override
    public Prototype clone() {
        return new Concreteprototype(this.property);
    }
}

class Main{
    public static void main(String[] args) {
        Concreteprototype cp = new Concreteprototype("Initial property");
        Concreteprototype clone1=(Concreteprototype) cp.clone();
        clone1.setProperty("Modified 1st property");
        Concreteprototype clone2=(Concreteprototype) cp.clone();
        clone2.setProperty("Modified 2nd property");
    }
}