package Oops;

class A{
    public void show1(){
        System.out.println("In class A show1()");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In class B show2()");
    }
}
public class UpandDownCasting {
    public static void main(String[] args) {
        A obj = new B();

        B obj1 = (B) obj;
        obj1.show1();
        ((B) obj).show2();
    }
}
