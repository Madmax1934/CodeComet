package designpatterns.factorypattern;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemfactory osf = new OperatingSystemfactory();
        OS os = osf.getInstance("sdfghj");
        os.spec();
    }
}
