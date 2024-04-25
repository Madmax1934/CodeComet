package Oops;

class Parent {
    public static void staticMethod() {
        System.out.println("Parent's static method");
    }
}


class Child extends Parent {
    public static void staticMethod() {
        System.out.println("Child's static method");
    }
}


public class PrepBytes {
    public static void main(String[] args) {
        Parent p = new Child();
        p.staticMethod();
    }
}
