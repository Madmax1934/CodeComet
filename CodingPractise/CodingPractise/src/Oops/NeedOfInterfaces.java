package Oops;

public class NeedOfInterfaces {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        dev.devApps(desk);
    }
}

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code()
    {
        System.out.println("code, compile and run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile and run faster");
    }
}

class Developer{
    public void devApps(Computer desk){
        System.out.println("Develop applications");
        desk.code();
    }
}
